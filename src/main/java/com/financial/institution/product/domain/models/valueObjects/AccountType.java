package com.financial.institution.product.domain.models.valueObjects;

import com.financial.institution.product.domain.models.enums.ProductTypeEnum;

public class AccountType {
    private final ProductTypeEnum accountType;

    public AccountType( ProductTypeEnum accountType) {
        this.accountType = accountType;
    }

    public ProductTypeEnum getAccountType() {
        return accountType;
    }
}
