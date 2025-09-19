package com.financial.institution.product.domain.models.enums;

public enum AccountStateEnum {
    ACTIVE("Activa"),
    INACTIVE("Inactiva"),
    CANCELLED("Cancelada");

    private final String estate;

    AccountStateEnum(String estate) {
        this.estate = estate;
    }

    public String getEstate() {
        return estate;
    }
}
