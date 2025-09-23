package com.financial.institution.product.application.services;

import com.financial.institution.product.application.useCases.FindByIdUseCase;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.models.valueObjects.IdProduct;
import com.financial.institution.product.domain.ports.ProductRepository;

public class FindByIdService implements FindByIdUseCase {
    private final ProductRepository productRepository;

    public FindByIdService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product execute(Long id) {
        return productRepository.findById(new IdProduct(id)).orElseThrow(()-> new RuntimeException("No se ha encontrado un producto con el id: " + id));
    }
}
