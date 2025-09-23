package com.financial.institution.product.application.useCases;

import com.financial.institution.customer.domain.models.valueObjects.Identification;
import com.financial.institution.product.domain.models.Product;

import java.util.List;

public interface FindByIdentificationCustomerUseCase {
    List<Product> execute(Identification identification);
}
