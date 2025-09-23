package com.financial.institution.product.application.Dto;

import com.financial.institution.product.domain.models.enums.AccountStateEnum;
import com.financial.institution.product.domain.models.enums.ProductTypeEnum;

import java.math.BigDecimal;

public class UpdateProductDto {
    private Long idProduct;
    private ProductTypeEnum accountType;
    private String accountNumber;
    private AccountStateEnum accountState;
    private BigDecimal balance;
    private BigDecimal balanceAvailable;
    private Boolean exemptGMF;
    private Long idCustomer;

    public UpdateProductDto(Long idProduct, ProductTypeEnum accountType, String accountNumber, AccountStateEnum accountState, BigDecimal balance, BigDecimal balanceAvailable, Boolean exemptGMF, Long idCustomer) {
        this.idProduct = idProduct;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountState = accountState;
        this.balance = balance;
        this.balanceAvailable = balanceAvailable;
        this.exemptGMF = exemptGMF;
        this.idCustomer = idCustomer;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public ProductTypeEnum getAccountType() {
        return accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountStateEnum getAccountState() {
        return accountState;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getBalanceAvailable() {
        return balanceAvailable;
    }

    public Boolean getExemptGMF() {
        return exemptGMF;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }
}
