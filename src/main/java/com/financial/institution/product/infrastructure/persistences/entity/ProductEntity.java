package com.financial.institution.product.infrastructure.persistences.entity;

import com.financial.institution.customer.infrastructure.persistences.entity.CustomerEntity;
import com.financial.institution.product.domain.models.enums.AccountStateEnum;
import com.financial.institution.product.domain.models.enums.ProductTypeEnum;
import com.financial.institution.transaction.infrastructure.persistences.entity.TransactionEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "productos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "estado", nullable = false)
    private AccountStateEnum state;

    @Column(name = "exenta_gmf", nullable = false)
    private Boolean exemptGMF;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime createAt;

    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDateTime updateAt;

    @Column(name = "numero_cuenta", nullable = false)
    private String productNumber;

    @Column(name = "saldo", nullable = false)
    private BigDecimal balance;

    @Column(name = "tipo_cuenta", nullable = false)
    private ProductTypeEnum typeProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private CustomerEntity customer;

    @OneToMany(mappedBy = "originProduct", fetch = FetchType.LAZY)
    private List<TransactionEntity> originTransactions;

    @OneToMany(mappedBy = "destinationProduct", fetch = FetchType.LAZY)
    private List<TransactionEntity> destinationTransactions;


}
