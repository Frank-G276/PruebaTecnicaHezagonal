package com.financial.institution.customer.application.useCases;

import com.financial.institution.customer.domain.models.Customer;

import java.util.Optional;

public interface FindByIdentificationNumberUseCase {
    Optional<Customer> execute(Integer number);
}
