package com.example.demomapstruct.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "student")
@SequenceGenerator(name = "hibernate_sequence", sequenceName = "seq_student_id", initialValue = 1, allocationSize=1)
@AttributeOverride(name = "id", column = @Column(name = "student_id"))
@Getter
@Setter
public class Student extends AbstractEntity{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "student")
    @JsonManagedReference(value = "student_studentAddress")
    private Set<StudentAddress> studentAddressList = new HashSet<>();

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass()!=o.getClass()){
            return false;
        }
        if(!super.equals(o)) return false;
        Student entity = (Student) o;
        return Objects.equals(firstName, entity.firstName)
                && Objects.equals(lastName, entity.lastName)
                && Objects.equals(age, entity.age);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), firstName, lastName, age);
    }

}
