package com.financial.institution.customer.application.useCases;

import com.financial.institution.customer.application.Dto.CreateCustomerDTO;
import com.financial.institution.customer.domain.models.Customer;

public interface CreateCustomerUseCase {
     Customer execute(CreateCustomerDTO createCustomerDTO);
}
