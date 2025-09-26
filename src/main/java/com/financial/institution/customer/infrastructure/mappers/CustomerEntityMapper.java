package com.financial.institution.customer.infrastructure.mappers;

import com.financial.institution.customer.domain.models.Customer;
import com.financial.institution.customer.domain.models.valueObjects.*;
import com.financial.institution.customer.infrastructure.persistences.entity.CustomerEntity;

public class CustomerEntityMapper {

    public static Customer toDomain(CustomerEntity entity){
        return new Customer(
                new CustomerId(entity.getId()),
                new Identification(entity.getIdentificationNumber(), entity.getIdentificationType()),
                new FullName(entity.getLastName(), entity.getFirstName()),
                new Email(entity.getEmail()),
                new BirthDate(entity.getBirthDate()),
                new CreatedAt(entity.getCreateAt()),
                new UpdateAt(entity.getUpdateAt())
        );
    }

    public static CustomerEntity toEntity(Customer domain){
        return new CustomerEntity(
                domain.getId().getId(),
                domain.getFullName().getFirstName(),
                domain.getFullName().getLastName(),
                domain.getIdentification().getNumber(),
                domain.getIdentification().getIdentificationType(),
                domain.getEmail().getEmail(),
                domain.getBirthDate().getBirthDate(),
                domain.getCreatedAt().getCreateAt(),
                domain.getUpdateAt().getUpdateAt()
        );
    }
}
