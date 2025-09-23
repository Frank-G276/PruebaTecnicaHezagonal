package com.financial.institution.product.application.services;

import com.financial.institution.product.application.useCases.StateChangeProductUseCase;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.models.enums.AccountStateEnum;
import com.financial.institution.product.domain.models.valueObjects.AccountState;
import com.financial.institution.product.domain.models.valueObjects.IdProduct;
import com.financial.institution.product.domain.ports.ProductRepository;

public class StateChangeProductService implements StateChangeProductUseCase {
    private final ProductRepository productRepository;

    public StateChangeProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String execute(Long id) {
        Product product = productRepository.findById(new IdProduct(id))
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con id : "+ id));

        AccountStateEnum estate = product.getAccountState().equals(AccountStateEnum.ACTIVE)
                ? AccountStateEnum.INACTIVE
                : AccountStateEnum.ACTIVE;

        product.stateChange(new AccountState(estate));
        return "Estado cambiado exitosamente a: " + estate;
    }
}
