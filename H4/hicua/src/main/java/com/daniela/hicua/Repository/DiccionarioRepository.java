package com.daniela.hicua.Repository;

        import com.daniela.hicua.Model.DiccionarioMo;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;

        import java.util.List;

public interface DiccionarioRepository extends JpaRepository<DiccionarioMo, Integer> {
    @Query(value = "select * from diccionario;", nativeQuery = true)
    public List<DiccionarioMo> getprimeralinea();

    @Query(value = "select * from diccionario ;", nativeQuery = true)
    public List<DiccionarioMo> getsegundalinea();

    @Query(value = "select * from diccionario ;", nativeQuery = true)
    public List<DiccionarioMo> getterceralinea();
}