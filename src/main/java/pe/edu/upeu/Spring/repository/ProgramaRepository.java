package pe.edu.upeu.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.Spring.entity.Programa;


@Repository
public interface ProgramaRepository extends CrudRepository<Programa, Long> {

}
