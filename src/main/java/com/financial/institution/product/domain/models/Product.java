package com.financial.institution.product.domain.models;

import com.financial.institution.customer.domain.models.valueObjects.CreatedAt;
import com.financial.institution.customer.domain.models.valueObjects.UpdateAt;
import com.financial.institution.product.domain.models.valueObjects.*;

public class Product {
    private IdProduct idProduct;
    private final AccountType accountType;
    private final AccountNumber accountNumber;
    private final AccountState accountState;
    private final Balance balance;
    private final Balance balanceAvailable;
    private final ExemptGMF exemptGMF;
    private final CreatedAt createdAt;
    private final UpdateAt updateAt;
    private final IdCustomer idCustomer;

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

    public Product updateBalances(Balance balance, Balance balanceAvailable){
        return new Product(
                this.idProduct,
                this.accountType,
                this.accountNumber,
                this.accountState,
                balance,
                balanceAvailable,
                this.exemptGMF,
                this.createdAt,
                this.idCustomer
        );
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
