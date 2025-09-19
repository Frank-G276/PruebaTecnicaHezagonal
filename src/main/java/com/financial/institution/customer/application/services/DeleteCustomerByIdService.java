package com.financial.institution.customer.application.services;

import com.financial.institution.customer.application.useCases.DeleteCustomerByIdUseCase;
import com.financial.institution.customer.domain.models.valueObjects.CustomerId;
import com.financial.institution.customer.domain.ports.CustomerRepository;

public class DeleteCustomerByIdService implements DeleteCustomerByIdUseCase {
    private final CustomerRepository customerRepository;

    public DeleteCustomerByIdService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(Long id){
        CustomerId customerId = new CustomerId(id);
        if (customerRepository.haveActiveOrInactiveProducts(customerId)) throw new IllegalArgumentException("No se puede eliminar un cliente con productos activos o inactivos ");
        customerRepository.deleteById(customerId);
    };

}
