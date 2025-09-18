package com.financial.institution.product.infrastructure.persistences.adapter;

import com.financial.institution.customer.domain.models.valueObjects.Identification;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.models.valueObjects.IdProduct;
import com.financial.institution.product.domain.ports.ProductRepository;
import com.financial.institution.product.infrastructure.persistences.repository.ProductRepositoryJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryAdapter implements ProductRepository {
    private ProductRepositoryJPA repositoryJPA;

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Optional<Product> findById(IdProduct idProduct) {
        return Optional.empty();
    }

    @Override
    public void deleteById(IdProduct idProduct) {

    }

    @Override
    public List<Product> findByIdentificationNumberCustomer(Identification identification) {
        return repositoryJPA.getByNumber(identification.getNumber());
    }
}
