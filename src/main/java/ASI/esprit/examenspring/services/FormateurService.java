package ASI.esprit.examenspring.services;


import ASI.esprit.examenspring.entities.Formateur;
import ASI.esprit.examenspring.repositories.FormateurRepository;
import org.springframework.stereotype.Service;

@Service
public class FormateurService{

    private final FormateurRepository formateurRepository;

    public FormateurService(FormateurRepository formateurRepository) {
        this.formateurRepository = formateurRepository;
    }

    public void addFormateur(Formateur formateur){
        formateurRepository.save(formateur);
    }
}
