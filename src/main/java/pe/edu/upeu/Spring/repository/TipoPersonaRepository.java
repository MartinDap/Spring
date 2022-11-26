package pe.edu.upeu.Spring.repository;


import pe.edu.upeu.Spring.entity.TipoPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPersonaRepository extends CrudRepository<TipoPersona, Long>{
    
}
