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
public class Formation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFormation;
    private String titre;
    private Niveau niveau;
    private Date dateDebut;
    private Date dateFin;
    private int nbrHeures;
    private int nbrMaxParticipants;
    private int frais;

    //association
    @ManyToOne
    private Formateur formateur;

    @ManyToMany
    private Set<Apprenant> apprenants;

}
