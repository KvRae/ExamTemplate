package ASI.esprit.examenspring.controllers;


import ASI.esprit.examenspring.entities.Formateur;
import ASI.esprit.examenspring.repositories.FormateurRepository;
import ASI.esprit.examenspring.services.FormateurService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FormateurController extends FormateurService {

    public FormateurController(FormateurRepository formateurRepository) {
        super(formateurRepository);
    }

    @PostMapping("/addFormateur")
    public void addFormateur(@RequestBody Formateur formateur){
        super.addFormateur(formateur);
    }

}
