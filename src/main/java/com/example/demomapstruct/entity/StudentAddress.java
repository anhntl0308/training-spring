package com.example.demomapstruct.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "student_address")
@SequenceGenerator(name = "hibernate_sequence", sequenceName = "seq_student_address_id", initialValue = 1, allocationSize=1)
@Getter
@Setter
public class StudentAddress extends AbstractEntity {
    @Column(name="address_id", nullable = false)
    private Long addressId;
    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id", insertable = false, updatable = false)
    @JsonBackReference("address_studentAddress")
    private Address address;

    @Column(name="student_id", nullable = false)
    private Long studentId;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", insertable = false, updatable = false)
    @JsonBackReference("student_studentAddress")
    private Student student;

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass()!=o.getClass()){
            return false;
        }
        if(!super.equals(o)) return false;
        StudentAddress entity = (StudentAddress) o;
        return Objects.equals(addressId, entity.addressId)
                && Objects.equals(studentId, entity.studentId);
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), addressId, studentId);
    }

}
