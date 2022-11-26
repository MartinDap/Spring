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
@Table(name = "pers_taller")
public class PersonaTaller implements Serializable{

    @Id
    @Column(name = "peta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long petaId;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "tall_id")
    private Taller taller;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "pers_id")
    private Persona persona;

}
