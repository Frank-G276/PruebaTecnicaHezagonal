package com.financial.institution.transaction.infrastructure.persistences.entity;

import com.financial.institution.product.infrastructure.persistences.entity.ProductEntity;
import com.financial.institution.transaction.domain.models.enums.TypeTransactionEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuenta_origen_id", nullable = false)
    private ProductEntity originProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuenta_destino_id")
    private ProductEntity destinationProduct;

    @Column(name = "monto", nullable = false)
    private BigDecimal amount;

    @Column(name = "descripcion", nullable = false)
    private  String description;

    @Column(name = "saldo_actual", nullable = false)
    private BigDecimal originBalance;

    @Column(name = "tipo_transaccion", nullable = false)
    private TypeTransactionEnum typeTransaction;

    @Column(name = "fecha_transaccion", nullable = false)
    private LocalDateTime createAt;


}
