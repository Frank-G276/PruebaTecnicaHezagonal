package com.financial.institution.product.domain.models;

import com.financial.institution.customer.domain.models.valueObjects.CreatedAt;
import com.financial.institution.customer.domain.models.valueObjects.UpdateAt;
import com.financial.institution.product.domain.models.valueObjects.*;
import com.financial.institution.transaction.domain.models.valueObjects.Amount;

public class Product {
    private IdProduct idProduct;
    private AccountType accountType;
    private AccountNumber accountNumber;
    private AccountState accountState;
    private Balance balance;
    private Balance balanceAvailable;
    private ExemptGMF exemptGMF;
    private CreatedAt createdAt;
    private UpdateAt updateAt;
    private IdCustomer idCustomer;

    public Product(IdProduct idProduct, AccountType accountType, AccountNumber accountNumber, AccountState accountState, Balance balance, Balance balanceAvailable, ExemptGMF exemptGMF, CreatedAt createdAt, IdCustomer idCustomer) {
        this.idProduct = idProduct;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountState = accountState;
        this.balance = balance;
        this.balanceAvailable = balanceAvailable;
        this.exemptGMF = exemptGMF;
        this.createdAt = createdAt;
        this.updateAt = new UpdateAt();
        this.idCustomer = idCustomer;
    }

    public Product(AccountType accountType, AccountNumber accountNumber, AccountState accountState, Balance balance, Balance balanceAvailable, ExemptGMF exemptGMF, IdCustomer idCustomer) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountState = accountState;
        this.balance = balance;
        this.balanceAvailable = balanceAvailable;
        this.exemptGMF = exemptGMF;
        this.createdAt = new CreatedAt();
        this.updateAt = new UpdateAt();
        this.idCustomer = idCustomer;
    }
    public Product stateChange(AccountState accountState) {
        return new Product(
                this.idProduct,
                this.accountType ,
                this.accountNumber ,
                accountState,
                this.balance ,
                this.balanceAvailable,
                this.exemptGMF ,
                this.createdAt,
                this.idCustomer
        );
    }

    public void deposit(Amount amount){
        this.balance = this.balance.add(amount);
        this.balanceAvailable = this.balanceAvailable.add(amount);
        this.updateAt = new UpdateAt();
    }

    public void withdraw(Amount amount){
        this.balance = this.balance.subtract(amount);
        this.balanceAvailable = this.balanceAvailable.subtract(amount);
        this.updateAt = new UpdateAt();
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

    public Balance getBalanceAvailable() {
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
