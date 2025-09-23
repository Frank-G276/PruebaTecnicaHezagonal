package com.financial.institution.product.application.services;

import com.financial.institution.product.application.useCases.CancelProductUseCase;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.models.enums.AccountStateEnum;
import com.financial.institution.product.domain.models.valueObjects.AccountState;
import com.financial.institution.product.domain.models.valueObjects.IdProduct;
import com.financial.institution.product.domain.ports.ProductRepository;

import java.math.BigDecimal;

public class CancelProductService implements CancelProductUseCase {
    private ProductRepository productRepository;

    public CancelProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String execute(Long id) {
        Product product = productRepository.findById(new IdProduct(id))
                .orElseThrow(() -> new RuntimeException("Producto no encontrado por id : " + id));

        if (!product.getBalance().getBalance().equals(BigDecimal.ZERO)){
            throw new IllegalArgumentException("No puedes cancelar productos con saldo disponible");
        }

        Product productCancel = product.stateChange(new AccountState(AccountStateEnum.CANCELLED));
        return "Se ha cancelado correctamente el producto con numero de cuenta : " + product.getAccountNumber().getAccountNumber();
    }

}
