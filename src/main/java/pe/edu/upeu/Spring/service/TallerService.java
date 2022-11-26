package pe.edu.upeu.Spring.service;

import pe.edu.upeu.Spring.entity.Taller;
import java.util.List;

public interface TallerService {

    public List<Taller> findAll();

    public Taller findById(Long id);

    public Taller save(Taller taller);

    public void delete(Taller taller);

    public void deleteById(Long id);
}