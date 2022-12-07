package pe.edu.upeu.Spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


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
    
    @Column(name = "pers_dni")
    private String persDni;

    @Column(name = "pers_celular")
    private String persCelular;

    @Column(name = "pers_correo")
    private String persCorreo;
    
    @ManyToOne //De muchos a uno
    @JoinColumn(name = "tipe_persona")
    private TipoPersona tipoPersona;

}
