package com.financial.institution.customer.infrastructure.persistences.repository;

import com.financial.institution.customer.infrastructure.persistences.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CustomerRepositoryJPA extends JpaRepository <CustomerEntity, Long> {
    Optional<CustomerEntity> findByIdentificationNumber(Integer number);

    @Query("""
        SELECT CASE WHEN COUNT(p) > 0 THEN TRUE ELSE FALSE END
        FROM ProductEntity p
        WHERE p.customer.id = :customerId
        AND p.state IN (com.financial.institution.product.domain.models.enums.AccountStateEnum.ACTIVE,
                                           com.financial.institution.product.domain.models.enums.AccountStateEnum.INACTIVE)
    """)
    Boolean hasActiveOrInactiveProducts(@Param("customerId") Long customerId);
}
