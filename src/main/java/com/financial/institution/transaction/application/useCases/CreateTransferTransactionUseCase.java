package com.financial.institution.transaction.application.useCases;

import com.financial.institution.transaction.application.dto.CreateTransactionDto;
import com.financial.institution.transaction.application.dto.TransferResultDto;

public interface CreateTransferTransactionUseCase {
    TransferResultDto execute(CreateTransactionDto transactionDto);
}
