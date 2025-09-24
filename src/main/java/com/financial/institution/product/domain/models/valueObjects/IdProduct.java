package com.financial.institution.product.domain.models.valueObjects;

public class IdProduct {
    private final Long idProduct;

    public IdProduct(Long idProduct) {
        if (idProduct < 0 ) throw new IllegalArgumentException("Id producto invalido: " + idProduct);
        this.idProduct = idProduct;
    }

    public Long getIdProduct() {
        return idProduct;
    }
}
