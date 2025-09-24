package com.financial.institution.transaction.application.dto;

import java.math.BigDecimal;

public record CreateTransactionDto(
        Long originIdProduct,
        Long destinationIdProduct,
        BigDecimal amount,
        String description,
        String typeTransaction
) {}
