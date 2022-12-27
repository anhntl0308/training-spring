package com.example.demomapstruct.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "address")
@SequenceGenerator(name = "hibernate_sequence", sequenceName = "seq_address_id", initialValue = 1, allocationSize=1)
@AttributeOverride(name = "id", column = @Column(name = "address_id"))
@Getter
@Setter
public class Address extends AbstractEntity{

    private String city;

    @Column(name = "full_address")
    private String fullAddress;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "address")
    @JsonManagedReference(value = "address_studentAddress")
    private Set<StudentAddress> studentAddressList = new HashSet<>();

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass()!=o.getClass()){
            return false;
        }
        if(!super.equals(o)) return false;
        Address entity = (Address)o;
        return Objects.equals(city, entity.city) && Objects.equals(fullAddress, entity.fullAddress);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), city, fullAddress);
    }
}
