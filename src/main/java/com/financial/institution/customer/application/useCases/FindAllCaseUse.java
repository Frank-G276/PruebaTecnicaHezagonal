package com.financial.institution.customer.application.useCases;

import com.financial.institution.customer.domain.models.Customer;

import java.util.List;

public interface FindAllCaseUse {
    List<Customer> execute();
}
