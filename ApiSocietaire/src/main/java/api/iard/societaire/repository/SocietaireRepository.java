package api.iard.societaire.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import api.iard.societaire.model.Societaire;

@Repository
public interface SocietaireRepository extends ElasticsearchRepository <Societaire, Long> {
    Societaire findByNumeroSocietaire(long numeroSocietaire);
    Societaire findByLettreCle(String lettreCle);
    Page<Societaire> findAll();
}
