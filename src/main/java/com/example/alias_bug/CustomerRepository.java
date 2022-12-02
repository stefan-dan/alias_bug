package com.example.alias_bug;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    @Query("""
            select new com.example.alias_bug.CustomerDto(
                customer.id,
                concat(customer.firstName, ' ', customer.lastName) as fullName
            )
            from Customer customer
            """)
    List<CustomerDto> findCustomers();
}
