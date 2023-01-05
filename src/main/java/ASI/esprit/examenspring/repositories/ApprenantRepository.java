package ASI.esprit.examenspring.repositories;

import ASI.esprit.examenspring.entities.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant, Integer> {




    void affecterApprenantFormation(int idApprenant, int idFormation);

}
//    public void assignEtudiantToDepartement(Long etudiantId, Long departementId) {
//
//        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
//        Departement departement = departementRepository.findById(departementId).orElse(null);
//        etudiant.setDepartement(departement);
//        etudiantRepository.save(etudiant);
//
//    }






