package com.financial.institution.product.application.services;

import com.financial.institution.product.application.dto.UpdateBalanceDto;
import com.financial.institution.product.application.useCases.UpdateBalancesProductUseCase;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.models.valueObjects.Balance;
import com.financial.institution.product.domain.models.valueObjects.IdProduct;
import com.financial.institution.product.domain.ports.ProductRepository;
import com.financial.institution.transaction.domain.models.enums.TypeTransactionEnum;

public class UpdateBalancesProductService implements UpdateBalancesProductUseCase {
    private final ProductRepository productRepository;

    public UpdateBalancesProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Balance execute(UpdateBalanceDto update, Long idProduct) {
        Product product = productRepository.findById(new IdProduct(idProduct)).orElseThrow();
        switch (update.getTypeTransaction()){
            case DEPOSIT -> product.deposit(update.getAmount());
            case WITHDRAWAL -> product.withdraw(update.getAmount());
        }

        productRepository.save(product);
        return product.getBalance();
    }
}
