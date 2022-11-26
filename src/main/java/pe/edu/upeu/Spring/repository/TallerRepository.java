package pe.edu.upeu.Spring.repository;

import pe.edu.upeu.Spring.entity.Taller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TallerRepository extends CrudRepository<Taller, Long>{
   
}