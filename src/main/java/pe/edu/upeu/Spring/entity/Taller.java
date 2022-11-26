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
@Table(name = "taller")
public class Taller implements Serializable{

    @Id
    @Column(name = "tall_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tallId;

    @Column(name = "tall_tema")
    String tallTema;

    @Column(name = "tall_fecha_inicio")
    String tallFechaInicio;

    @Column(name = "tall_fecha_fin")
    String tallFechaFin;

    @Column(name = "tall_hora")
    String tallHora;

    @Column(name = "tall_lugar")
    String tallLugar;

    @Column(name = "tall_desc")
    String tallDesc;

    @Column(name = "tall_direccion")
    String tallDireccion;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "prog_id")
    private Programa programa;
}