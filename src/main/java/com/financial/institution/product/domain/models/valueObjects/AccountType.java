package com.financial.institution.product.domain.models.valueObjects;

import com.financial.institution.product.domain.models.enums.ProductoTypeEnum;

public class AccountType {
    private final ProductoTypeEnum accountType;

    public AccountType( ProductoTypeEnum accountType) {
        this.accountType = accountType;
    }

    public ProductoTypeEnum getAccountType() {
        return accountType;
    }
}
