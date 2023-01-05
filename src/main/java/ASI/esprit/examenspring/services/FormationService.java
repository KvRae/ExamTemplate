package ASI.esprit.examenspring.services;

import ASI.esprit.examenspring.entities.Formation;
import ASI.esprit.examenspring.repositories.FormationRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FormationService {

    private final FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public void addFormation(Formation formation, int idFormateur){
        formationRepository.save(formation);
    }

    @Scheduled(cron = "* 5 * * * ?")
    public void getNbrApprenantByFormation(){
        formationRepository.getNbrApprenantByFormation();
        System.out.println("Nombre d'apprenants par formation : " +
                formationRepository.getNbrApprenantByFormation());


    }

}
