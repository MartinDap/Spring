package pe.edu.upeu.Spring.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.entity.Taller;
import pe.edu.upeu.Spring.repository.TallerRepository;
import pe.edu.upeu.Spring.service.TallerService;

/**
 *
 * @author Martín Del Águila
 */

@Service
public class TallerServiceImpl implements TallerService{

    @Autowired
    private TallerRepository TallerRepository;

    @Transactional
    @Override
    public List<Taller> findAll() {
        return (List<Taller>) TallerRepository.findAll();
    }

    @Override
    public Taller findById(Long id) {
        return TallerRepository.findById(id).orElse(null);
    }

    @Override
    public Taller save(Taller taller) {
        return TallerRepository.save(taller);
    }

    @Override
    public void delete(Taller taller) {
        TallerRepository.delete(taller);
    }

    @Override
    public void deleteById(Long id) {
        TallerRepository.deleteById(id);
    }
}
