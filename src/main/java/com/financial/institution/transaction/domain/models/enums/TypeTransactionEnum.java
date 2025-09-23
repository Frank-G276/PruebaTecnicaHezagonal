package com.financial.institution.transaction.domain.models.enums;

public enum TypeTransactionEnum {
    DEPOSIT("Consignacion"),
    WITHDRAWAL("Retiro"),
    TRANSFER("Transferencia");
    private final String type;

    TypeTransactionEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
