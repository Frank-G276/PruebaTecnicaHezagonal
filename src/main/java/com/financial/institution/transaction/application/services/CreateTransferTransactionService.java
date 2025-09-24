package com.financial.institution.transaction.application.services;

import com.financial.institution.transaction.application.dto.CreateTransactionDto;
import com.financial.institution.transaction.application.useCases.CreateTransferTransactionUseCase;
import com.financial.institution.transaction.domain.models.Transaction;

public class CreateTransferTransactionService implements CreateTransferTransactionUseCase {


    @Override
    public Transaction execute(CreateTransactionDto transactionDto) {
        return null;
    }
}
