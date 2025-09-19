package com.financial.institution.transaction.domain.models.valueObjects;

import java.math.BigDecimal;

public class Amount {
    private final BigDecimal amount;

    public Amount(BigDecimal amount) {
        if (amount.equals(BigDecimal.ZERO)) throw new IllegalArgumentException("El monto no puede ser 0");
        if (amount.compareTo(BigDecimal.ZERO)<0)  throw new IllegalArgumentException("El monto no puede ser menor a cero");
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
