package com.financial.institution.transaction.application.services;

import com.financial.institution.transaction.application.dto.CreateTransactionDto;
import com.financial.institution.transaction.application.useCases.CreateDepositTransactionUseCase;
import com.financial.institution.transaction.application.useCases.CreateTransactionUseCase;
import com.financial.institution.transaction.application.useCases.CreateTransferTransactionUseCase;
import com.financial.institution.transaction.application.useCases.CreateWithdrawalTransactionUseCase;
import com.financial.institution.transaction.domain.models.Transaction;
import com.financial.institution.transaction.domain.ports.TransactionRepository;

import com.financial.institution.transaction.domain.models.enums.TypeTransactionEnum;

public class CreateTransactionService implements CreateTransactionUseCase {
    private final CreateDepositTransactionUseCase createDepositTransactionUseCase;
    private final CreateTransferTransactionUseCase createTransferTransactionUseCase;
    private final CreateWithdrawalTransactionUseCase createWithdrawalTransactionUseCase;

    public CreateTransactionService(TransactionRepository transactionRepository, CreateDepositTransactionService createDepositTransactionService, CreateDepositTransactionUseCase createDepositTransactionUseCase, CreateTransferTransactionUseCase createTransferTransactionUseCase, CreateWithdrawalTransactionUseCase createWithdrawalTransactionUseCase) {
        this.createDepositTransactionUseCase = createDepositTransactionUseCase;
        this.createTransferTransactionUseCase = createTransferTransactionUseCase;
        this.createWithdrawalTransactionUseCase = createWithdrawalTransactionUseCase;
    }

    @Override
    public Transaction execute(CreateTransactionDto transactionDto) {
        TypeTransactionEnum type = TypeTransactionEnum.valueOf(transactionDto.typeTransaction());
        return switch (type){
            case DEPOSIT -> createDepositTransactionUseCase.execute(transactionDto);
            case WITHDRAWAL -> createWithdrawalTransactionUseCase.execute(transactionDto);
            case TRANSFER -> createTransferTransactionUseCase.execute(transactionDto);
        };
    }
}
