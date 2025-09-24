package com.financial.institution.customer.application.dto;

import com.financial.institution.customer.domain.models.enums.IdentificationType;

import java.time.LocalDate;

public class CreateCustomerDTO {
    private Integer numberIdentification;
    private IdentificationType identificationType;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;

    public CreateCustomerDTO(Integer numberIdentification, IdentificationType identificationType, String firstName, String lastName, String email, LocalDate birthDate) {
        this.numberIdentification = numberIdentification;
        this.identificationType = identificationType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Integer getNumberIdentification() {
        return numberIdentification;
    }

    public IdentificationType getIdentificationType() {
        return identificationType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
