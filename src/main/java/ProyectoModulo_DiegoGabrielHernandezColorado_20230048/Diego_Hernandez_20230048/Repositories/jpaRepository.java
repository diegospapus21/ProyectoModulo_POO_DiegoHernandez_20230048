package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Repositories;

public interface jpaRepository<T, T1> {
    boolean existsById(Long id);

    void deleteById(Long id);
}
