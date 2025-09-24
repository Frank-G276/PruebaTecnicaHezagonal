package com.financial.institution.customer.application.dto;

import com.financial.institution.customer.domain.models.enums.IdentificationType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UpdateCustomerDTO {
    private Long id;
    private Integer numberIdentification;
    private IdentificationType identificationType;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    private LocalDateTime createdAt;

    public UpdateCustomerDTO(Long id, Integer numberIdentification, IdentificationType identificationType, String firstName, String lastName, String email, LocalDate birthDate, LocalDateTime createdAt) {
        this.id = id;
        this.numberIdentification = numberIdentification;
        this.identificationType = identificationType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
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

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
}
