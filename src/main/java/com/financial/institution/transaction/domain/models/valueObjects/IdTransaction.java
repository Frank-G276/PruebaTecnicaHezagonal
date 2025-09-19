package com.financial.institution.transaction.domain.models.valueObjects;

public class IdTransaction {
    private final Long idTransaction;

    public IdTransaction(Long idTransaction) {
        if (idTransaction==null || idTransaction <0) throw new IllegalArgumentException("Id transferencia  indalido");
        this.idTransaction = idTransaction;
    }

    public Long getIdTransaction() {
        return idTransaction;
    }
}
