package ASI.esprit.examenspring.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Apprenant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idApprenant;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    //Association
    @ManyToMany(mappedBy = "apprenants")
    private Set<Formation> formations;

}
