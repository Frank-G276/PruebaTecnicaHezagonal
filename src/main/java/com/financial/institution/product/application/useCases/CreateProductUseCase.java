package com.financial.institution.product.application.useCases;

import com.financial.institution.product.application.dto.CreateProductDto;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.models.enums.ProductTypeEnum;

public interface CreateProductUseCase {
    Product execute(CreateProductDto productDto);

    String createAccountNumber(ProductTypeEnum accountType);
}
