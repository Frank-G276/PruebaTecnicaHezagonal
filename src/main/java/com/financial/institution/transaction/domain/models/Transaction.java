package com.financial.institution.transaction.domain.models;

import com.financial.institution.product.domain.models.valueObjects.AccountNumber;
import com.financial.institution.product.domain.models.valueObjects.Balance;
import com.financial.institution.transaction.domain.models.enums.TypeTransactionEnum;
import com.financial.institution.transaction.domain.models.valueObjects.Amount;
import com.financial.institution.transaction.domain.models.valueObjects.Description;
import com.financial.institution.transaction.domain.models.valueObjects.IdTransaction;

public class Transaction {
    private IdTransaction idTransaction;
    private AccountNumber originAccountNumber;
    private AccountNumber destinationAccountNumber;
    private Amount amount;
    private Description description;
    private Balance originBalance;
    private Balance originBalanceAvailable;
    private TypeTransactionEnum typeTransaction;

    public Transaction(IdTransaction idTransaction, AccountNumber originAccountNumber, AccountNumber destinationAccountNumber, Amount amount, Description description, Balance originBalance, Balance originBalanceAvailable, TypeTransactionEnum typeTransaction) {
        this.idTransaction = idTransaction;
        this.originAccountNumber = originAccountNumber;
        this.destinationAccountNumber = destinationAccountNumber;
        this.amount = amount;
        this.description = description;
        this.originBalance = originBalance;
        this.originBalanceAvailable = originBalanceAvailable;
        this.typeTransaction = typeTransaction;
    }

    public Transaction(AccountNumber originAccountNumber, AccountNumber destinationAccountNumber, Amount amount, Description description, Balance originBalance, Balance originBalanceAvailable, TypeTransactionEnum typeTransaction) {
        this.originAccountNumber = originAccountNumber;
        this.destinationAccountNumber = destinationAccountNumber;
        this.amount = amount;
        this.description = description;
        this.originBalance = originBalance;
        this.originBalanceAvailable = originBalanceAvailable;
        this.typeTransaction = typeTransaction;
    }

    public IdTransaction getIdTransaction() {
        return idTransaction;
    }

    public AccountNumber getOriginAccountNumber() {
        return originAccountNumber;
    }

    public AccountNumber getDestinationAccountNumber() {
        return destinationAccountNumber;
    }

    public Amount getAmount() {
        return amount;
    }

    public Description getDescription() {
        return description;
    }

    public Balance getOriginBalance() {
        return originBalance;
    }

    public Balance getOriginBalanceAvailable() {
        return originBalanceAvailable;
    }

    public TypeTransactionEnum getTypeTransaction() {
        return typeTransaction;
    }
}
