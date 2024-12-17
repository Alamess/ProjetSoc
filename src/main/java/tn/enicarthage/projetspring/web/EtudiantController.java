package tn.enicarthage.projetspring.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import tn.enicarthage.projetspring.entities.Etudiant;
import tn.enicarthage.projetspring.services.IEtudiantService;

@Controller
public class EtudiantController {

    @Autowired
    private IEtudiantService etdServ;

    @QueryMapping
    public Etudiant etudiantById (@Argument Long id) {
        return etdServ.findById(id);
    }

    @MutationMapping
    public String ajouterFavoris (@Argument Long idEtd, @Argument Long idStage) {
        etdServ.AjouterFavoris(idEtd, idStage);
        return "Stage ajouté aux favoris";
    }

    @MutationMapping
    public String supprimerFavoris (@Argument Long idEtd, @Argument Long idStage) {
        return etdServ.SupprimerFavoris(idEtd, idStage);
    }
}

