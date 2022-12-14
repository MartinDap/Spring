package pe.edu.upeu.Spring.repository;

import pe.edu.upeu.Spring.entity.Asistencia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenciaRepository extends CrudRepository<Asistencia, Long> {
    
}
