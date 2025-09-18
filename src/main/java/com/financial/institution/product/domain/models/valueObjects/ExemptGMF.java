package com.financial.institution.product.domain.models.valueObjects;

public class ExemptGMF {
    private final Boolean exemptGMF;

    public ExemptGMF(Boolean exemptGMF) {
        this.exemptGMF = exemptGMF;
    }

    public Boolean getExemptGMF() {
        return exemptGMF;
    }
}
