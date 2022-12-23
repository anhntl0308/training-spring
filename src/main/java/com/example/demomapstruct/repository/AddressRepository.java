package com.example.demomapstruct.repository;

import com.example.demomapstruct.entity.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;

@Repository
public interface AddressRepository extends AbstractRepository<Address> {

    // cach 1
    Address findAddressesByAddress(String address);

    Address findAddressesByAddressLike(String address);

    Address findAddressByIdBetween(Long firstValue, Long secondValue);

    //cach 2
    @Query(value = "select a from Address a")
    Address findDistinctById(Long Id);

    @Query(value = "from Address a where a.student.firstName = :firstName")
    Address findAddressByStudentFirstName(@Param("firstName") String firstName);

    @Query(value = "select * from Address a left join Student s on a.id = s.address_id", nativeQuery = true)
    Address findAddressByStudentFirstName2(@Param("firstName") String firstName);

//    @NamedNativeQuery(query = "Select * from Address a where a.", name = )
//    Address
}
