package com.financial.institution.product.domain.models.valueObjects;

import java.math.BigDecimal;

public class Balance {
    private final BigDecimal balance;

    public Balance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance(){
        return balance;
    }
}
