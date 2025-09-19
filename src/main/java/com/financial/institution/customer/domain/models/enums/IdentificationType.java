package com.financial.institution.customer.domain.models.enums;

public enum IdentificationType {
    CITIZEN_ID("CC", "Cédula de Ciudadanía"),
    FOREIGN_ID("CE", "Cédula de Extranjería"),
    PASSPORT("PA", "Pasaporte"),
    NIT("NIT", "Número de Identificación Tributaria");

    private final String code;
    private final String description;

    IdentificationType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}