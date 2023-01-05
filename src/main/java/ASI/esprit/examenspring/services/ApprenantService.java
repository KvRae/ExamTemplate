package ASI.esprit.examenspring.services;


import ASI.esprit.examenspring.entities.Apprenant;
import ASI.esprit.examenspring.entities.Formation;
import ASI.esprit.examenspring.repositories.ApprenantRepository;
import ASI.esprit.examenspring.repositories.FormationRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ApprenantService {

    private final ApprenantRepository apprenantRepository;
    private final FormationRepository formationRepository;

    public ApprenantService(ApprenantRepository apprenantRepository, FormationRepository formationRepository) {
        this.apprenantRepository = apprenantRepository;
        this.formationRepository = formationRepository;
    }

    public void addApprenant(Apprenant apprenant){
        apprenantRepository.save(apprenant);
    }

    public void affecterApprenantFormation(int idApprenant, int idFormation){
        Apprenant apprenant = apprenantRepository.findById(idApprenant).get();
        Formation formation = formationRepository.findById(idFormation).get();
        apprenant.setFormations((Set<Formation>) formation);
        apprenantRepository.save(apprenant);

    }
}
