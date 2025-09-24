package com.financial.institution.transaction.application.services;

import com.financial.institution.product.application.dto.UpdateBalanceDto;
import com.financial.institution.product.application.useCases.UpdateBalancesProductUseCase;
import com.financial.institution.product.domain.models.valueObjects.Balance;
import com.financial.institution.product.domain.models.valueObjects.IdProduct;
import com.financial.institution.transaction.application.dto.CreateTransactionDto;
import com.financial.institution.transaction.application.useCases.CreateDepositTransactionUseCase;
import com.financial.institution.transaction.domain.models.Transaction;
import com.financial.institution.transaction.domain.models.enums.TypeTransactionEnum;
import com.financial.institution.transaction.domain.models.valueObjects.Amount;
import com.financial.institution.transaction.domain.models.valueObjects.Description;
import com.financial.institution.transaction.domain.ports.TransactionRepository;


public class CreateDepositTransactionService implements CreateDepositTransactionUseCase {
    private final UpdateBalancesProductUseCase updateBalancesProductUseCase;
    private final TransactionRepository transactionRepository;

    public CreateDepositTransactionService(UpdateBalancesProductUseCase updateBalancesProductUseCase, TransactionRepository transactionRepository) {
        this.updateBalancesProductUseCase = updateBalancesProductUseCase;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction execute(CreateTransactionDto transactionDto) {
        Balance balanceOriginProduct = updateBalancesProductUseCase.execute(
                new UpdateBalanceDto(
                    TypeTransactionEnum.DEPOSIT,
                    new Amount(transactionDto.amount())),
                transactionDto.originIdProduct()
        );

        Transaction transaction = new Transaction(
                new IdProduct(transactionDto.originIdProduct()),
                new IdProduct(null),
                new Amount(transactionDto.amount()),
                new Description(transactionDto.description()),
                new Balance(balanceOriginProduct.getBalance()),
                TypeTransactionEnum.valueOf(transactionDto.typeTransaction())
        );

        return transactionRepository.save(transaction);
    }
}
