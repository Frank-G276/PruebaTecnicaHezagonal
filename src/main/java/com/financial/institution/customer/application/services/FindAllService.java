package com.financial.institution.customer.application.services;

import com.financial.institution.customer.application.useCases.FindAllCaseUse;
import com.financial.institution.customer.domain.models.Customer;
import com.financial.institution.customer.domain.ports.CustomerRepository;

import java.util.List;

public class FindAllService implements FindAllCaseUse {
    private final CustomerRepository customerRepository;

    public FindAllService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> execute(){
        return customerRepository.findAll();
    }
}
