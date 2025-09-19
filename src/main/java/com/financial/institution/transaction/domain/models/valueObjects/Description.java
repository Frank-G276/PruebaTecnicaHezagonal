package com.financial.institution.transaction.domain.models.valueObjects;

public class Description {
    private final String description;

    public Description(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
