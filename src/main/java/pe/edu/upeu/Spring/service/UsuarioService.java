/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.Spring.service;

import pe.edu.upeu.Spring.entity.Usuario;

/**
 *
 * @author Martín Del Águila
 */
public interface UsuarioService{
    
    public Usuario findByUsername(String username);
    
}
