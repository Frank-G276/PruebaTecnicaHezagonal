package com.financial.institution.product.domain.models.enums;

public enum ProductoTypeEnum {
    CHECKING_ACCOUNT("33"),
    SAVING_ACCOUNT("53");

    private final String prefix;

    ProductoTypeEnum(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
