package com.financial.institution.customer.application.services;

import com.financial.institution.customer.application.dto.UpdateCustomerDTO;
import com.financial.institution.customer.application.useCases.UpdateCustomerUseCase;
import com.financial.institution.customer.domain.models.Customer;
import com.financial.institution.customer.domain.models.valueObjects.*;
import com.financial.institution.customer.domain.ports.CustomerRepository;

public class UpdateCustomerService implements UpdateCustomerUseCase {
    private final CustomerRepository customerRepository;

    public UpdateCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer execute(UpdateCustomerDTO customerDTO){
        Customer customer = new Customer(
                new CustomerId(customerDTO.getId()),
                new Identification(customerDTO.getNumberIdentification(), customerDTO.getIdentificationType()),
                new FullName(customerDTO.getLastName(), customerDTO.getFirstName()),
                new Email(customerDTO.getEmail()),
                new BirthDate(customerDTO.getBirthDate()),
                new CreatedAt(customerDTO.getCreatedAt())
        );

        return customerRepository.save(customer);

    }
}
