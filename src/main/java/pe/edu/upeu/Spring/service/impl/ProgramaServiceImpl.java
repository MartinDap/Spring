/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.entity.Programa;
import pe.edu.upeu.Spring.repository.ProgramaRepository;
import pe.edu.upeu.Spring.service.ProgramaService;

/**
 *
 * @author tpp
 */
@Service
public class ProgramaServiceImpl implements ProgramaService {

    @Autowired
    ProgramaRepository programaRepository;

    @Override
    public List<Programa> findAll() {
        return (List<Programa>) programaRepository.findAll();
    }

    @Override
    public Programa findById(Long id) {
        return programaRepository.findById(id).orElse(null);
    }

    @Override
    public Programa save(Programa programa) {
        return programaRepository.save(programa);
    }

    @Override
    public void delete(Programa programa) {
        programaRepository.delete(programa);
    }

    @Override
    public void deleteById(Long id) {
        programaRepository.deleteById(id);
    }
}
