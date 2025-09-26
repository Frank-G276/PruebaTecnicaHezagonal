package com.financial.institution.transaction.application.useCases;

import com.financial.institution.transaction.application.dto.CreateTransactionDto;

public interface CreateTransactionUseCase {
    Object execute(CreateTransactionDto transactionDto);
}
