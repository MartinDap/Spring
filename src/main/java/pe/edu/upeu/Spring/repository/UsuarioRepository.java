/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.upeu.Spring.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    public Usuario findByUsername(String username);
}
