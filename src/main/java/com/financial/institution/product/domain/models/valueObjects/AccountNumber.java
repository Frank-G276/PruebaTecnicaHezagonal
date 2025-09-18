package com.financial.institution.product.domain.models.valueObjects;

public class AccountNumber {
    private final String accountNumber;

    public AccountNumber(String accountNumber) {
        if (!(accountNumber.length() == 10))throw new IllegalArgumentException("La extencion del numereo de cuenta debe ser de 10 digitos: "+ accountNumber);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
