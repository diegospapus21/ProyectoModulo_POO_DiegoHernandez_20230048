package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Optional;

@Entity
@Table(name = "tbProvider")
@Data
public class ProveedorEntity {

    private static final Object generationtype = 1;
    @Id
    private Long providerID;

    @Column(name = "providerName", nullable = false, length = 50)
    private String providerName;

    @Column(name = "providerPhone", length = 25)
    private String providerPhone;

    @Column(name = "providerAddress", length = 128)
    private String providerAddress;

    @Column(name = "providerEmail", length = 100)
    private String providerEmail;

    @Column(name = "providerCode", length = 35)
    private String providerCode;

    @Column(name = "providerStatus", nullable = false)
    private Integer providerStatus = 1;

    @Column(name = "providerComments", length = 255)
    private String providerComments;

    public Optional<Object> findById(Long id) {
        return null;
    }
}
