package com.financial.institution.product.application.Dto;

import com.financial.institution.product.domain.models.enums.AccountStateEnum;
import com.financial.institution.product.domain.models.enums.ProductTypeEnum;

import java.math.BigDecimal;

public class CreateProductDto {
    private ProductTypeEnum accountType;
    private Boolean exemptGMF;
    private Long idCustomer;

    public CreateProductDto(ProductTypeEnum accountType, Boolean exemptGMF, Long idCustomer) {
        this.accountType = accountType;
        this.exemptGMF = exemptGMF;
        this.idCustomer = idCustomer;
    }

    public ProductTypeEnum getAccountType() {
        return accountType;
    }

    public Boolean getExemptGMF() {
        return exemptGMF;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }
}
