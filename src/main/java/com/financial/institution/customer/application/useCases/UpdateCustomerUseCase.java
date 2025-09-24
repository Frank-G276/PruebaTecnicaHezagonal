package com.financial.institution.customer.application.useCases;

import com.financial.institution.customer.application.dto.UpdateCustomerDTO;
import com.financial.institution.customer.domain.models.Customer;

public interface UpdateCustomerUseCase {
    Customer execute(UpdateCustomerDTO saveCustomerDTO);
}
