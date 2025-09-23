package com.financial.institution.product.domain.models.enums;

public enum ProductTypeEnum {
    CHECKING_ACCOUNT("33"),
    SAVING_ACCOUNT("53");

    private final String prefix;

    ProductTypeEnum(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
