package pe.edu.upeu.Spring.service;

import pe.edu.upeu.Spring.entity.PersonaTaller;
import java.util.List;

public interface PersonaTallerService {

    public List<PersonaTaller> findAll();

    public PersonaTaller findById(Long id);

    public PersonaTaller save(PersonaTaller personaTaller);

    public void delete(PersonaTaller personaTaller);

    public void deleteById(Long id);
}

