package ASI.esprit.examenspring.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFormateur;
    private String nom;
    private String prenom;
    private float tarifHoraire;
    private String email;

    //Association
    @OneToMany(mappedBy = "formateur")
    private Set<Formation> formations;


}
