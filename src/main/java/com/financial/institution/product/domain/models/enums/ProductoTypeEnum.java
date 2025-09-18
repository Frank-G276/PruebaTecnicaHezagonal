package com.financial.institution.product.domain.models.enums;

public enum ProductoTypeEnum {
    CUENTA_CORRIENTE("33"),
    CUENTA_AHORROS("53");

    private final String prefijo;

    ProductoTypeEnum(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getPrefijo() {
        return prefijo;
    }
}
