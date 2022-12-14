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

@Data
@Entity
@Table(name = "materiales")
public class Materiales{

    @Id
    @Column(name = "mate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mateId;

    @Column(name = "mate_descri")
    String mateDescri;

    @Column(name = "mate_name")
    String mateName;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "tall_tema")
    private Taller taller;
}