package com.financial.institution.transaction.domain.models.enums;

public enum TypeTransaction {
    DEPOSIT("Consignacion"),
    WITHDRAWAL("Retiro"),
    TRANSFER("Transferencia");
    private final String type;

    TypeTransaction(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
