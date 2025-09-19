package com.financial.institution.product.domain.models.valueObjects;

import java.math.BigDecimal;

public class BalanceAvailable {
    private final BigDecimal balanceAvailable;

    public BalanceAvailable(BigDecimal balanceAvailable) {
        if (balanceAvailable.compareTo(BigDecimal.ZERO)<0) throw new IllegalArgumentException("El saldo no puede ser negativo: "+ balanceAvailable);
        this.balanceAvailable = balanceAvailable;
    }

    public BigDecimal getBalanceAvailable() {
        return balanceAvailable;
    }
}
