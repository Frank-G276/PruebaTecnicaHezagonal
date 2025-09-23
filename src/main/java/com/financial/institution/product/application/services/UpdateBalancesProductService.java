package com.financial.institution.product.application.services;

import com.financial.institution.product.application.Dto.UpdateBalanceDto;
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
        if (update.getTypeTransaction().equals(TypeTransactionEnum.DEPOSIT)){
            product.updateBalances(
                    new Balance(product.getBalance().getBalance().add(update.getAmount().getAmount())),
                    new Balance(product.getBalanceAvailable().getBalance().add(update.getAmount().getAmount())));
        } else if (update.getTypeTransaction().equals(TypeTransactionEnum.WITHDRAWAL)){
            product.updateBalances(
                    new Balance(product.getBalance().getBalance().subtract(update.getAmount().getAmount())),
                    new Balance(product.getBalanceAvailable().getBalance().subtract(update.getAmount().getAmount())));
        }

        return product.getBalance();
    }
}
