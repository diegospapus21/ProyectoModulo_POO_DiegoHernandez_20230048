package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Repositories;

import ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Entities.ProveedorEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProveedorRepository extends jpaRepository <ProveedorEntity,Long>{
    boolean existsByProviderName(String providerName);
    boolean existsByProviderCode(String providerCode);

    Optional<Object> findById(Long id);

    List<ProveedorEntity> findAll();

    ProveedorEntity save(ProveedorEntity proveedor);
}
