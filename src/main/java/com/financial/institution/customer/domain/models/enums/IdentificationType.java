package com.financial.institution.customer.domain.models.enums;

public enum IdentificationType {
    CEDULA_CIUDADANIA("CC", "Cédula de Ciudadanía"),
    CEDULA_EXTRANJERIA("CE", "Cédula de Extranjería"),
    PASAPORTE("PA", "Pasaporte"),
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