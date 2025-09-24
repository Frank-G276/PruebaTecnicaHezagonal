package com.financial.institution.transaction.application.useCases;

import com.financial.institution.transaction.application.dto.CreateTransactionDto;
import com.financial.institution.transaction.domain.models.Transaction;

public interface CreateTransferTransactionUseCase {
    Transaction execute(CreateTransactionDto transactionDto);
}
