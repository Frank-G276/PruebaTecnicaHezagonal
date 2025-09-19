package com.financial.institution.customer.domain.ports;

import com.financial.institution.customer.domain.models.Customer;
import com.financial.institution.customer.domain.models.valueObjects.CustomerId;
import com.financial.institution.customer.domain.models.valueObjects.Identification;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
     List<Customer> findAll();
     Optional<Customer> findByIdentificationNumber(Integer number);
     Customer save(Customer customer);
     void deleteById(CustomerId id);
     Boolean haveActiveOrInactiveProducts(CustomerId id);
}
