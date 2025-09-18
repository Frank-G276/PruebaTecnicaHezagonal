package com.financial.institution.customer.domain.ports;

import com.financial.institution.customer.domain.models.Customer;
import com.financial.institution.customer.domain.models.valueObjects.CustomerId;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
     List<Customer> findAll();
     Optional<Customer> findById(CustomerId id);
     Customer save(Customer customer);
     void deleteById(CustomerId id);
}
