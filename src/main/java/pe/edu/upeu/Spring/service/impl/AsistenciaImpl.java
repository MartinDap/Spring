package pe.edu.upeu.Spring.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.repository.AsistenciaRepository;
import pe.edu.upeu.Spring.service.AsistenciaService;
import pe.edu.upeu.Spring.entity.Asistencia;

@Service
public class AsistenciaImpl implements AsistenciaService{
    
    @Autowired
    AsistenciaRepository asistenciaRepository;

    @Override
    public List<Asistencia> findAll() {
        return (List<Asistencia>) asistenciaRepository.findAll();
    }

    @Override
    public Asistencia findById(Long id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    @Override
    public Asistencia save(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public void delete(Asistencia asistencia) {
        asistenciaRepository.delete(asistencia);
    }

    @Override
    public void deleteById(Long id) {
        asistenciaRepository.deleteById(id);
    }
}
