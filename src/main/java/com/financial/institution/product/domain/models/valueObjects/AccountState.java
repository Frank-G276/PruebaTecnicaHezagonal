package com.financial.institution.product.domain.models.valueObjects;

import com.financial.institution.product.domain.models.enums.AccountStateEnum;

public class AccountState {
    private final AccountStateEnum accountState;

    public AccountState(AccountStateEnum accountState) {
        this.accountState = accountState;
    }

    public AccountStateEnum getAccountState() {
        return accountState;
    }
}
