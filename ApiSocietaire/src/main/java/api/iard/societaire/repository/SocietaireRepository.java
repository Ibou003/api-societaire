package api.iard.societaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.iard.societaire.model.Societaire;

@Repository
public interface SocietaireRepository extends JpaRepository<Societaire, Long> {
    Societaire findByNumeroSocietaire(Long numeroSocietaire);
}
