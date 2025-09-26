package com.financial.institution.customer.infrastructure.persistences.adapters;

import com.financial.institution.customer.domain.models.Customer;
import com.financial.institution.customer.domain.models.valueObjects.CustomerId;
import com.financial.institution.customer.domain.ports.CustomerRepository;
import com.financial.institution.customer.infrastructure.mappers.CustomerEntityMapper;
import com.financial.institution.customer.infrastructure.persistences.repository.CustomerRepositoryJPA;

import java.util.List;
import java.util.Optional;

public class CustomerRepositoryAdapter implements CustomerRepository {
    private final CustomerRepositoryJPA repositoryJPA;

    public CustomerRepositoryAdapter(CustomerRepositoryJPA repositoryJPA, CustomerEntityMapper mapper) {
        this.repositoryJPA = repositoryJPA;
    }

    @Override
    public List<Customer> findAll() {
        return repositoryJPA.findAll().stream().map(CustomerEntityMapper::toDomain).toList();
    }

    @Override
    public Optional<Customer> findByIdentificationNumber(Integer number) {
        return repositoryJPA.findByIdentificationNumber(number).map(CustomerEntityMapper::toDomain);
    }

    @Override
    public Customer save(Customer customer) {
        return CustomerEntityMapper.toDomain(repositoryJPA.save(CustomerEntityMapper.toEntity(customer)));
    }

    @Override
    public void deleteById(CustomerId id) {
        repositoryJPA.deleteById(id.getId());
    }

    @Override
    public Boolean haveActiveOrInactiveProducts(CustomerId id) {
        return repositoryJPA.hasActiveOrInactiveProducts(id.getId());
    }
}
