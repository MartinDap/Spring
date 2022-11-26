package pe.edu.upeu.Spring.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.entity.TipoPersona;
import pe.edu.upeu.Spring.repository.TipoPersonaRepository;
import pe.edu.upeu.Spring.service.TipoPersonaService;

/**
 *
 * @author Martín Del Águila
 */
@Service
public class TipoPersonaServiceImpl implements TipoPersonaService{

    @Autowired
    private TipoPersonaRepository TipoPersonaRepository;

    @Transactional
    @Override
    public List<TipoPersona> findAll() {
        return (List<TipoPersona>) TipoPersonaRepository.findAll();
    }

    @Override
    public TipoPersona findById(Long id) {
        return TipoPersonaRepository.findById(id).orElse(null);
    }

    @Override
    public TipoPersona save(TipoPersona tipoPersona) {
        return TipoPersonaRepository.save(tipoPersona);
    }

    @Override
    public void delete(TipoPersona tipoPersona) {
        TipoPersonaRepository.delete(tipoPersona);
    }

    @Override
    public void deleteById(Long id) {
        TipoPersonaRepository.deleteById(id);
    }
}
