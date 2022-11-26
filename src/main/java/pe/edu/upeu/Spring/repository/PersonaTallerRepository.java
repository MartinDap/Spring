package pe.edu.upeu.Spring.repository;

import pe.edu.upeu.Spring.entity.PersonaTaller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaTallerRepository extends CrudRepository<PersonaTaller, Long>{
   
}

