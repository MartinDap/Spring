
package pe.edu.upeu.Spring.service;

import java.util.List;
import pe.edu.upeu.Spring.entity.Persona;


public interface PersonaService {

    public List<Persona> findAll();

    public Persona findById(Long id);

    public Persona save(Persona persona);

    public void delete(Persona persona);

    public void deleteById(Long id);

}
