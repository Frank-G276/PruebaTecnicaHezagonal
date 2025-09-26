package com.financial.institution.transaction.application.dto;

import com.financial.institution.transaction.domain.models.Transaction;

public record TransferResultDto(Transaction origin, Transaction destination) { }
