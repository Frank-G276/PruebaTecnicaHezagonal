package com.financial.institution.customer.domain.models;

import com.financial.institution.customer.domain.models.valueObjects.*;

public class Customer {
    private CustomerId id;
    private Identification identification;
    private FullName fullName;
    private Email email;
    private BirthDate birthDate;
    private CreatedAt createdAt;
    private UpdateAt updateAt;

    public Customer(CustomerId id, Identification identification, FullName fullName, Email email, BirthDate birthDate, CreatedAt createdAt, UpdateAt updateAt) {
        this.id = id;
        this.identification = identification;
        this.fullName = fullName;
        this.email = email;
        this.birthDate = birthDate;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Customer(CustomerId id, Identification identification, FullName fullName, Email email, BirthDate birthDate, CreatedAt createdAt) {
        this.id = id;
        this.identification = identification;
        this.fullName = fullName;
        this.email = email;
        this.birthDate = birthDate;
        this.createdAt = createdAt;
        this.updateAt = new UpdateAt();
    }

    public Customer(Identification identification, FullName fullName, Email email, BirthDate birthDate) {
        this.identification = identification;
        this.fullName = fullName;
        this.email = email;
        this.birthDate = birthDate;
        this.createdAt = new CreatedAt();
        this.updateAt = new UpdateAt();
    }



    public CustomerId getId() {return id;}

    public Identification getIdentification() {return identification;}

    public FullName getFullName() {return fullName;}

    public Email getEmail() {return email;}

    public BirthDate getBirthDate() {return birthDate;}

    public CreatedAt getCreatedAt() {return createdAt;}

    public UpdateAt getUpdateAt() {return updateAt;}
}
