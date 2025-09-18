package com.financial.institution.customer.domain.models.valueObjects;

public class FullName {
    private final String lastName;
    private final String firstName;

    public FullName(String lastName, String firstName) {
        if (lastName.length() < 2 || firstName.length() < 2) throw new IllegalArgumentException("El nombre o apellido debe tener más de dos caracteres: "+ firstName + " " + lastName);
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
