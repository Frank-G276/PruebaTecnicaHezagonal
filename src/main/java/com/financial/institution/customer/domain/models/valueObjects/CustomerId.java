package com.financial.institution.customer.domain.models.valueObjects;

public class CustomerId {
    private final Long id;

    public CustomerId(Long id) {
        if (id < 0 || id == null) throw new IllegalArgumentException("Id Invalido: " + id);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
