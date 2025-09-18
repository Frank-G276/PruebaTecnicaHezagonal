package com.financial.institution.customer.domain.models.valueObjects;

import java.time.LocalDate;
import java.time.Period;

public class BirthDate {
    private final LocalDate birthDate;

    public BirthDate(LocalDate birthDate) {
        if (birthDate == null || !isOfLegalAge(birthDate))throw new IllegalArgumentException("Fecha de nacimiento es invalida : " + birthDate);

        this.birthDate = birthDate;
    }

    private boolean isOfLegalAge(LocalDate birthDate){
        Integer Age = Period.between(birthDate, LocalDate.now()).getYears();
        return Age >= 18 ;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
