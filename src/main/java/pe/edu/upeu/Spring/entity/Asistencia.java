package pe.edu.upeu.Spring.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="asistencia")
public class Asistencia implements Serializable{
    
    @Id
    @Column(name = "asisten_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long asisId;

    @Column(name = "estado_asis")
    String asisEsta;

    
    @ManyToOne //De muchos a uno
    @JoinColumn(name = "pers_nombre")
    private Persona persona;
    
    @ManyToOne //De muchos a uno
    @JoinColumn(name = "tall_tema")
    private Taller taller;
    
}
