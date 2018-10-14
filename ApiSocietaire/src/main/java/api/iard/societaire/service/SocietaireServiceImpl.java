package api.iard.societaire.service;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;


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
            societaire.setAdresseSocietaire(adresseSocietaire);

            societaireRepository.save(societaire);
        }
        return societaire;
    }

    @Override
    public Societaire modicationSocietaire(Long numeroSocietaire, Societaire societaire) {
        Societaire societaire1 = societaireRepository.findByNumeroSocietaire(numeroSocietaire);
        // on peut modifier que le nom du societaire le reste basta
        if (societaire1 != null) {
            societaire1.setNomSocietaire(societaire.getNomSocietaire()==null ? societaire1.getNomSocietaire() : societaire.getNomSocietaire());
        }
        return societaireRepository.save(societaire1);
    }
    
	@Override
	public Societaire addSocietaire(Societaire societaire) {
		if(societaire.getNumeroSocietaire() != null) {
			System.out.println(societaire);
			return this.societaireRepository.save(societaire);
		}
		return null;
	}

	@Override
	public List<Societaire> listSocietaire() {
		return this.societaireRepository.findAll().getContent();
	}
}
