package pe.edu.upeu.Spring.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.entity.Materiales;
import pe.edu.upeu.Spring.repository.MaterialesRepository;
import pe.edu.upeu.Spring.service.MaterialesService;

/**
 *
 * @author Martín Del Águila
 */
@Service
public class MaterialesServiceImpl implements MaterialesService{
    @Autowired
    private MaterialesRepository MaterialesRepository;

    @Transactional
    @Override
    public List<Materiales> findAll() {
        return (List<Materiales>) MaterialesRepository.findAll();
    }

    @Override
    public Materiales findById(Long id) {
        return MaterialesRepository.findById(id).orElse(null);
    }

    @Override
    public Materiales save(Materiales materiales) {
        return MaterialesRepository.save(materiales);
    }

    @Override
    public void delete(Materiales materiales) {
        MaterialesRepository.delete(materiales);
    }

    @Override
    public void deleteById(Long id) {
        MaterialesRepository.deleteById(id);
    }
}
