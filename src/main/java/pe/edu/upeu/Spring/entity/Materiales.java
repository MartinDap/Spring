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
@Table(name = "materiales")
public class Materiales implements Serializable{

    @Id
    @Column(name = "mate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mateId;

    @Column(name = "mate_descri")
    String mateDescri;

    @Column(name = "mate_mane")
    String mateName;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "tall_id")
    private Taller taller;
}