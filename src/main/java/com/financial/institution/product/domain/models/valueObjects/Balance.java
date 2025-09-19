package com.financial.institution.product.domain.models.valueObjects;

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
}
