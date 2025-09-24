package com.financial.institution.product.application.dto;

import com.financial.institution.transaction.domain.models.enums.TypeTransactionEnum;
import com.financial.institution.transaction.domain.models.valueObjects.Amount;

public class UpdateBalanceDto {
    private TypeTransactionEnum typeTransaction;
    private Amount amount;

    public UpdateBalanceDto(TypeTransactionEnum typeTransaction, Amount amount) {
        this.typeTransaction = typeTransaction;
        this.amount = amount;
    }

    public TypeTransactionEnum getTypeTransaction() {
        return typeTransaction;
    }

    public Amount getAmount() {
        return amount;
    }
}
