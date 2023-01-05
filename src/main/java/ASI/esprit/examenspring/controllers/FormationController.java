package ASI.esprit.examenspring.controllers;

import ASI.esprit.examenspring.entities.Formation;
import ASI.esprit.examenspring.repositories.FormationRepository;
import ASI.esprit.examenspring.services.FormationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FormationController extends FormationService {

    public FormationController(FormationRepository formationRepository) {
        super(formationRepository);
    }
    @PostMapping("/addFormation")
    public void addFormation(@RequestBody Formation formation, int idFormateur){
        super.addFormation(formation,idFormateur);
    }
}
