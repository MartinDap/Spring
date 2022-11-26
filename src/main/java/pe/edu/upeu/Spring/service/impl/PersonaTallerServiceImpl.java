package pe.edu.upeu.Spring.service.impl;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.entity.PersonaTaller;
import pe.edu.upeu.Spring.repository.PersonaTallerRepository;
import pe.edu.upeu.Spring.service.PersonaTallerService;

/**
 *
 * @author Martín Del Águila
 */
@Service
public class PersonaTallerServiceImpl implements PersonaTallerService{

    @Autowired
    private PersonaTallerRepository personaTallerRepository;

    @Transactional
    @Override
    public List<PersonaTaller> findAll() {
        return (List<PersonaTaller>) personaTallerRepository.findAll();
    }

    @Override
    public PersonaTaller findById(Long id) {
        return personaTallerRepository.findById(id).orElse(null);
    }

    @Override
    public PersonaTaller save(PersonaTaller personaTaller) {
        return personaTallerRepository.save(personaTaller);
    }

    @Override
    public void delete(PersonaTaller personaTaller) {
        personaTallerRepository.delete(personaTaller);
    }

    @Override
    public void deleteById(Long id) {
        personaTallerRepository.deleteById(id);
    }
}
