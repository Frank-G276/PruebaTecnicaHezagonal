package com.financial.institution.customer.domain.models.valueObjects;

import com.financial.institution.customer.domain.models.enums.IdentificationType;

public class Identification {
    private final Integer number;
    private final IdentificationType identificationType;

    public Identification(Integer number, IdentificationType identificationType) {
        if (number < 0 ) throw new IllegalArgumentException("Numero de identificacion no puede ser negativo: " + number);
        this.number = number;
        this.identificationType = identificationType;
    }

    public IdentificationType getIdentificationType() {
        return identificationType;
    }

    public Integer getNumber() {
        return number;
    }
}
