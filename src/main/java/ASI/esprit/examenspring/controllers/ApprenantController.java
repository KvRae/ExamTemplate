package ASI.esprit.examenspring.controllers;


import ASI.esprit.examenspring.entities.Apprenant;
import ASI.esprit.examenspring.repositories.ApprenantRepository;
import ASI.esprit.examenspring.services.ApprenantService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApprenantController extends ApprenantService {

    public ApprenantController(ApprenantRepository apprenantRepository) {
        super(apprenantRepository, formationRepository);
    }

    @PostMapping("/addApprenant")
    public void addApprenant(@RequestBody Apprenant apprenant){
        super.addApprenant(apprenant);
    }
}

