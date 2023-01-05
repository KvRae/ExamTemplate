package ASI.esprit.examenspring.repositories;

import ASI.esprit.examenspring.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Integer> {

    @Query("select count (f.apprenants) from Formation f ")
    int getNbrApprenantByFormation();
}
