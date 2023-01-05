package ASI.esprit.examenspring.repositories;

import ASI.esprit.examenspring.entities.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Integer> {
}
