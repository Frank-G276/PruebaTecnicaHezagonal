package com.financial.institution.customer.infrastructure.persistences.entity;

import com.financial.institution.customer.domain.models.enums.IdentificationType;
import com.financial.institution.product.infrastructure.persistences.entity.ProductEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombres", nullable = false)
    private String firstName;

    @Column(name = "apellido", nullable = false)
    private String lastName;

    @Column(name = "numero_identificacion", nullable = false)
    private Integer identificationNumber;

    @Column(name = "tipo_identificacion", nullable = false)
    private IdentificationType identificationType;

    @Column(name = "correo_electronico", nullable = false)
    private String email;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate birthDate;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime createAt;

    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDateTime updateAt;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<ProductEntity> products;

    public CustomerEntity(Long id, String firstName, String lastName, Integer identificationNumber, IdentificationType identificationType, String email, LocalDate birthDate, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
        this.identificationType = identificationType;
        this.email = email;
        this.birthDate = birthDate;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }
}
