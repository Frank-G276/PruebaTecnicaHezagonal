package com.financial.institution.product.application.useCases;

import com.financial.institution.product.application.Dto.CreateProductDto;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.models.enums.ProductTypeEnum;
import com.financial.institution.product.domain.models.valueObjects.AccountNumber;
import com.financial.institution.product.domain.models.valueObjects.AccountType;

public interface CreateProductUseCase {
    Product execute(CreateProductDto productDto);

    String createAccountNumber(ProductTypeEnum accountType);
}
