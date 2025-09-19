package com.financial.institution.customer.application.services;

import com.financial.institution.customer.application.Dto.CreateCustomerDTO;
import com.financial.institution.customer.application.useCases.CreateCustomerUseCase;
import com.financial.institution.customer.domain.models.Customer;
import com.financial.institution.customer.domain.models.valueObjects.BirthDate;
import com.financial.institution.customer.domain.models.valueObjects.Email;
import com.financial.institution.customer.domain.models.valueObjects.FullName;
import com.financial.institution.customer.domain.models.valueObjects.Identification;
import com.financial.institution.customer.domain.ports.CustomerRepository;

public class CreateCustomerService implements CreateCustomerUseCase {
    private final CustomerRepository customerRepository;

    public CreateCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer execute(CreateCustomerDTO create){
      Customer customer = new Customer(
              new Identification(create.getNumberIdentification(), create.getIdentificationType()),
              new FullName(create.getLastName(), create.getFirstName()),
              new Email(create.getEmail()),
              new BirthDate(create.getBirthDate())
      );
      return customerRepository.save(customer);
    };
}
