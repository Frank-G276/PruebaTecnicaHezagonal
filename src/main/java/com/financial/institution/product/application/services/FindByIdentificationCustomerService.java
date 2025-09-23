package com.financial.institution.product.application.services;

import com.financial.institution.customer.domain.models.valueObjects.Identification;
import com.financial.institution.product.application.useCases.FindByIdentificationCustomerUseCase;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.ports.ProductRepository;

import java.util.List;

public class FindByIdentificationCustomerService implements FindByIdentificationCustomerUseCase {
    private final ProductRepository productRepository;

    public FindByIdentificationCustomerService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> execute(Identification identification) {
        return productRepository.findByIdentificationNumberCustomer(identification);
    }
}
