package com.example.demomapstruct.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "address")
@SequenceGenerator(name = "hibernate_sequence", sequenceName = "seq_address_id", initialValue = 1, allocationSize=1)
@AttributeOverride(name = "id", column = @Column(name = "address_id"))
@Getter
@Setter
public class Address extends AbstractEntity{

    private String city;

    @Column(name = "address")
    private String address;

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
}
