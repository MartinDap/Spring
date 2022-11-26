
package pe.edu.upeu.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.Spring.entity.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
