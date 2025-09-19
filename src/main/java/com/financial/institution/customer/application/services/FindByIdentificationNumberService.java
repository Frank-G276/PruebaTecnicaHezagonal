package com.financial.institution.customer.application.services;

import com.financial.institution.customer.application.useCases.FindByIdentificationNumberUseCase;
import com.financial.institution.customer.domain.models.Customer;
import com.financial.institution.customer.domain.ports.CustomerRepository;

import java.util.Optional;

public class FindByIdentificationNumberService implements FindByIdentificationNumberUseCase {
    private final CustomerRepository customerRepository;

    public FindByIdentificationNumberService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> execute(Integer number){
        return customerRepository.findByIdentificationNumber(number);
    }
}
