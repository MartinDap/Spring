/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author tpp
 */
@Entity
@Data
@Table(name = "persona")
public class Persona {

    @Id
    @Column(name = "pers_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long persId;

    @Column(name = "pers_nombre")
    private String persNombre;

    @Column(name = "pers_ap_paterno")
    private String persApPaterno;

    @Column(name = "pers_ap_materno")
    private String persApMaterno;

    @Column(name = "pers_celular")
    private String persCelular;

    @Column(name = "pers_correo")
    private String persCorreo;
}
