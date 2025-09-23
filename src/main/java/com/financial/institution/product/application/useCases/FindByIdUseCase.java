package com.financial.institution.product.application.useCases;

import com.financial.institution.product.domain.models.Product;

public interface FindByIdUseCase {
    Product execute(Long id);
}
