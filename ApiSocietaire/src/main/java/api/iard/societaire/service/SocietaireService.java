package api.iard.societaire.service;

import java.util.List;
import api.iard.societaire.model.AdresseSocietaire;
import api.iard.societaire.model.Societaire;

public interface SocietaireService {

    Societaire modificationAdresseSocietaire(Long numeroSocietaire, AdresseSocietaire adresseSocietaire);
    Societaire modicationSocietaire(Long numeroSocietaire, Societaire societaire);
    Societaire addSocietaire(Societaire societaire);
    List <Societaire> listSocietaire();
    // test 3
}
