package pe.edu.upeu.Spring.service;

import pe.edu.upeu.Spring.entity.Materiales;
import java.util.List;

public interface MaterialesService {

    public List<Materiales> findAll();

    public Materiales findById(Long id);

    public Materiales save(Materiales materiales);

    public void delete(Materiales materiales);

    public void deleteById(Long id);
    
}