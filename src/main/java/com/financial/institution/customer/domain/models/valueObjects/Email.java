package com.financial.institution.customer.domain.models.valueObjects;

public class Email {
    private final String email;

    public Email(String email) {
        if (email == null || !isValidFormat(email))throw new IllegalArgumentException("Correo electronico invalido: " + email);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    private boolean isValidFormat(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
}
