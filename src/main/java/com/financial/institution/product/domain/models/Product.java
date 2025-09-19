package com.financial.institution.product.domain.models;

import com.financial.institution.customer.domain.models.valueObjects.CreatedAt;
import com.financial.institution.customer.domain.models.valueObjects.UpdateAt;
import com.financial.institution.product.domain.models.valueObjects.*;

public class Product {
    private IdProduct idProduct;
    private AccountType accountType;
    private AccountNumber accountNumber;
    private AccountState accountState;
    private Balance balance;
    private BalanceAvailable balanceAvailable;
    private ExemptGMF exemptGMF;
    private CreatedAt createdAt;
    private UpdateAt updateAt;
    private IdCustomer idCustomer;

    public Product(IdProduct idProduct, AccountType accountType, AccountNumber accountNumber, AccountState accountState, Balance balance, BalanceAvailable balanceAvailable, ExemptGMF exemptGMF, CreatedAt createdAt, UpdateAt updateAt, IdCustomer idCustomer) {
        this.idProduct = idProduct;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountState = accountState;
        this.balance = balance;
        this.balanceAvailable = balanceAvailable;
        this.exemptGMF = exemptGMF;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.idCustomer = idCustomer;
    }

    public Product(AccountType accountType, AccountNumber accountNumber, AccountState accountState, Balance balance, BalanceAvailable balanceAvailable, ExemptGMF exemptGMF, CreatedAt createdAt, UpdateAt updateAt, IdCustomer idCustomer) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountState = accountState;
        this.balance = balance;
        this.balanceAvailable = balanceAvailable;
        this.exemptGMF = exemptGMF;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.idCustomer = idCustomer;
    }

    public IdProduct getIdProduct() {
        return idProduct;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public Balance getBalance() {
        return balance;
    }

    public BalanceAvailable getBalanceAvailable() {
        return balanceAvailable;
    }

    public ExemptGMF getExemptGMF() {
        return exemptGMF;
    }

    public CreatedAt getCreatedAt() {
        return createdAt;
    }

    public UpdateAt getUpdateAt() {
        return updateAt;
    }

    public IdCustomer getIdCustomer() {
        return idCustomer;
    }
}
