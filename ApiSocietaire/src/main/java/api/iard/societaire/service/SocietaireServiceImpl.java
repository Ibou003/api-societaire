package api.iard.societaire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.iard.societaire.model.AdresseSocietaire;
import api.iard.societaire.model.Societaire;
import api.iard.societaire.repository.SocietaireRepository;

@Service
public class SocietaireServiceImpl implements SocietaireService {

    @Autowired
    public SocietaireRepository societaireRepository;

    @Override
    public Societaire modificationAdresseSocietaire(Long numeroSocietaire, AdresseSocietaire adresseSocietaire) {
        Societaire societaire = societaireRepository.findByNumeroSocietaire(numeroSocietaire);
        if (societaire != null && societaire.getNumeroSocietaire() != null && adresseSocietaire != null) {
            if (societaire.getAdresseSocietaire() == null) {
                AdresseSocietaire adresseS = new AdresseSocietaire();
                societaire.setAdresseSocietaire(adresseS);
            }
            System.out.println(adresseSocietaire.toString());
            societaire.setAdresseSocietaire(adresseSocietaire);

            societaireRepository.save(societaire);
        }
        return societaire;
    }

    @Override
    public Societaire modicationSocietaire(Long numeroSocietaire, Societaire societaire) {
        Societaire societaire1 = societaireRepository.findByNumeroSocietaire(numeroSocietaire);
        if (societaire1 != null) {
            societaire1.setCodeEmployeur(societaire.getCodeEmployeur());
            societaire1.setCodeInsee(societaire.getCodeInsee());
            societaire1.setStatut(societaire.getStatut());
        }
        return societaireRepository.save(societaire1);
    }

	@Override
	public Societaire addSocietaire(Societaire societaire) {
		return this.societaireRepository.save(societaire);
	}
}
