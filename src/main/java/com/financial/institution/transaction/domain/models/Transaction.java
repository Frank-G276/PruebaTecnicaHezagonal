package com.financial.institution.transaction.domain.models;

import com.financial.institution.customer.domain.models.valueObjects.CreatedAt;
import com.financial.institution.product.domain.models.valueObjects.AccountNumber;
import com.financial.institution.product.domain.models.valueObjects.Balance;
import com.financial.institution.product.domain.models.valueObjects.IdProduct;
import com.financial.institution.transaction.domain.models.enums.TypeTransactionEnum;
import com.financial.institution.transaction.domain.models.valueObjects.Amount;
import com.financial.institution.transaction.domain.models.valueObjects.Description;
import com.financial.institution.transaction.domain.models.valueObjects.IdTransaction;

public class Transaction {
    private IdTransaction idTransaction;
    private IdProduct originIdProduct;
    private IdProduct destinationIdProduct;
    private Amount amount;
    private Description description;
    private Balance originBalance;
    private TypeTransactionEnum typeTransaction;
    private CreatedAt createdAt;

    public Transaction(IdTransaction idTransaction, IdProduct originIdProduct, IdProduct destinationIdProduct, Amount amount, Description description, Balance originBalance, TypeTransactionEnum typeTransaction, CreatedAt createdAt) {
        if (originIdProduct == null) {
            throw new IllegalArgumentException("El producto de origen es obligatorio");
        }
        this.idTransaction = idTransaction;
        this.originIdProduct = originIdProduct;
        this.destinationIdProduct = destinationIdProduct;
        this.amount = amount;
        this.description = description;
        this.originBalance = originBalance;
        this.typeTransaction = typeTransaction;
        this.createdAt = createdAt;
    }

    public Transaction(IdProduct originIdProduct, IdProduct destinationIdProduct, Amount amount, Description description, Balance originBalance, TypeTransactionEnum typeTransaction) {
        if (originIdProduct == null) {
            throw new IllegalArgumentException("El producto de origen es obligatorio");
        }
        this.originIdProduct = originIdProduct;
        this.destinationIdProduct = destinationIdProduct;
        this.amount = amount;
        this.description = description;
        this.originBalance = originBalance;
        this.typeTransaction = typeTransaction;
        this.createdAt = new CreatedAt();
    }

    public IdTransaction getIdTransaction() {
        return idTransaction;
    }

    public IdProduct getOriginIdProduct() {
        return originIdProduct;
    }

    public IdProduct getDestinationIdProduct() {
        return destinationIdProduct;
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

    public TypeTransactionEnum getTypeTransaction() {
        return typeTransaction;
    }

    public CreatedAt getCreatedAt(){ return createdAt;}
}
