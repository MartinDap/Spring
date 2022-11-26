package pe.edu.upeu.Spring.repository;


import pe.edu.upeu.Spring.entity.Materiales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialesRepository extends CrudRepository<Materiales, Long>{
    
}
