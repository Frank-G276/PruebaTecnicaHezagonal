package com.financial.institution.product.domain.models.valueObjects;

import com.financial.institution.transaction.domain.models.valueObjects.Amount;

import java.math.BigDecimal;

public class Balance {
    private final BigDecimal balance;

    public Balance(BigDecimal balance) {
        if (balance.compareTo(BigDecimal.ZERO)<0) throw new IllegalArgumentException("El saldo no puede ser negativo");
        this.balance = balance;
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public Balance add(Amount amount){
        return new Balance(this.balance.add(amount.getAmount()));
    }

    public Balance subtract(Amount amount){
        return new Balance(this.balance.subtract(amount.getAmount()));
    }
}
