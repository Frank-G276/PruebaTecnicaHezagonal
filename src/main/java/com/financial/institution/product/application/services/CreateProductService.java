package com.financial.institution.product.application.services;

import com.financial.institution.product.application.Dto.CreateProductDto;
import com.financial.institution.product.application.useCases.CreateProductUseCase;
import com.financial.institution.product.domain.models.Product;
import com.financial.institution.product.domain.models.enums.AccountStateEnum;
import com.financial.institution.product.domain.models.enums.ProductTypeEnum;
import com.financial.institution.product.domain.models.valueObjects.*;
import com.financial.institution.product.domain.ports.ProductRepository;

import java.math.BigDecimal;
import java.util.Random;

public class CreateProductService implements CreateProductUseCase{
    private ProductRepository productRepository;


    @Override
    public Product execute(CreateProductDto productDto) {
        Product product = new Product(
                new AccountType(productDto.getAccountType()),
                new AccountNumber(createAccountNumber(productDto.getAccountType())),
                new AccountState(AccountStateEnum.ACTIVE),
                new Balance(BigDecimal.ZERO),
                new Balance(BigDecimal.ZERO),
                new ExemptGMF(productDto.getExemptGMF()),
                new IdCustomer(productDto.getIdCustomer())
        );
        return productRepository.save(product);
    }

    @Override
    public String createAccountNumber(ProductTypeEnum accountType) {
        String bank = "0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();


        do {
            result.setLength(0);
            result.append(accountType.getPrefix());

            for (int i = 0; i < 8 ; i++){
                int index = random.nextInt(bank.length());
                result.append(bank.charAt(index));
            }
        }while (productRepository.existAccountNumber(result.toString()));


        return result.toString();
    }
}
