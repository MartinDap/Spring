package pe.edu.upeu.Spring.service;


import pe.edu.upeu.Spring.entity.TipoPersona;
import java.util.List;

public interface TipoPersonaService {

    public List<TipoPersona> findAll();

    public TipoPersona findById(Long id);

    public TipoPersona save(TipoPersona tipopersona);

    public void delete(TipoPersona tipopersona);

    public void deleteById(Long id);
}
