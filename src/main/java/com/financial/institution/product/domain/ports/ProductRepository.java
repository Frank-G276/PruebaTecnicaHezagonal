package com.financial.institution.product.domain.ports;

import com.financial.institution.customer.domain.models.valueObjects.Identification;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.models.valueObjects.IdProduct;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Product save(Product product);
    List<Product> findAll();
    Optional<Product> findById(IdProduct idProduct);
    void deleteById(IdProduct idProduct);
    List<Product> findByIdentificationNumberCustomer(Identification identification);
    Boolean existAccountNumber(String number);
}
