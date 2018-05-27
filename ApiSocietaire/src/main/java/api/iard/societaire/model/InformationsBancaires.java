package api.iard.societaire.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

//@Entity
@Document(indexName = "informationsBancaires", type = "informationsBancaires", shards = 1)
public class InformationsBancaires implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1837304810660360048L;

    /**
     * Code IBAN connu.
     *
     */
    @Id
//    @GeneratedValue
    private Long id;

    private String codeIBAN;

    /**
     * Code BIC connu.
     */
    private String codeBIC;

    /**
     * Titulaire du compte:<br>
     * - 0 Sans information<br>
     * - 1 Sociétaire<br>
     * - 2 Autre que sociétaire.
     */
    private Long typeTitulaireDomiciliation;

    /**
     * Code modalité de paiement:<br>
     * - 0 Sans information<br>
     * - 1 Tip<br>
     * - 2 Prélèvement (1 fois)<br>
     * - 3 Prélèvement (2 fois)<br>
     * - 4 Prélèvement (10 fois)<br>
     * - 5 Prélèvement (12 fois)
     */
    private Long codeModalitePaiement;

    /**
     * Nom du titulaire du compte.<br>
     * La donnée est limitée à 32 caractères, en majuscule.
     */
    private String nomTitulaireDomiciliation;

    /**
     * Libelle domiciliation bancaire (ex: AXA BANQUE).
     */
    private String libelleDomiciliation;

    /**
     * Le code statut du mandat.<br>
     * - A Abandonné<br>
     * - C Caduc<br>
     * - I En instance<br>
     * - R Révoqué<br>
     * - V Valide
     */
    private String codeStatutMandat;

    /**
     * Adresse1 si le titulaire du compte est autre que le sociétaire.
     */
    private String adresse1TitulaireCompteAutre;

    /**
     * Résidence si le titulaire du compte est autre que le sociétaire.
     */
    private String adresse2TitulaireCompteAutre;

    /**
     * Code postal adresse si le titulaire du compte est autre que le
     * sociétaire.
     */
    private String codePostalTitulaireCompteAutre;

    /**
     * Commune adresse si le titulaire du compte est autre que le sociétaire.
     */
    private String communeTitulaireCompteAutre;

    public String getCodeIBAN() {
        return codeIBAN;
    }

    public void setCodeIBAN(String codeIBAN) {
        this.codeIBAN = codeIBAN;
    }

    public String getCodeBIC() {
        return codeBIC;
    }

    public void setCodeBIC(String codeBIC) {
        this.codeBIC = codeBIC;
    }

    public Long getTypeTitulaireDomiciliation() {
        return typeTitulaireDomiciliation;
    }

    public void setTypeTitulaireDomiciliation(Long typeTitulaireDomiciliation) {
        this.typeTitulaireDomiciliation = typeTitulaireDomiciliation;
    }

    public Long getCodeModalitePaiement() {
        return codeModalitePaiement;
    }

    public void setCodeModalitePaiement(Long codeModalitePaiement) {
        this.codeModalitePaiement = codeModalitePaiement;
    }

    public String getNomTitulaireDomiciliation() {
        return nomTitulaireDomiciliation;
    }

    public void setNomTitulaireDomiciliation(String nomTitulaireDomiciliation) {
        this.nomTitulaireDomiciliation = nomTitulaireDomiciliation;
    }

    public String getLibelleDomiciliation() {
        return libelleDomiciliation;
    }

    public void setLibelleDomiciliation(String libelleDomiciliation) {
        this.libelleDomiciliation = libelleDomiciliation;
    }

    public String getCodeStatutMandat() {
        return codeStatutMandat;
    }

    public void setCodeStatutMandat(String codeStatutMandat) {
        this.codeStatutMandat = codeStatutMandat;
    }

    public String getAdresse1TitulaireCompteAutre() {
        return adresse1TitulaireCompteAutre;
    }

    public void setAdresse1TitulaireCompteAutre(String adresse1TitulaireCompteAutre) {
        this.adresse1TitulaireCompteAutre = adresse1TitulaireCompteAutre;
    }

    public String getAdresse2TitulaireCompteAutre() {
        return adresse2TitulaireCompteAutre;
    }

    public void setAdresse2TitulaireCompteAutre(String adresse2TitulaireCompteAutre) {
        this.adresse2TitulaireCompteAutre = adresse2TitulaireCompteAutre;
    }

    public String getCodePostalTitulaireCompteAutre() {
        return codePostalTitulaireCompteAutre;
    }

    public void setCodePostalTitulaireCompteAutre(String codePostalTitulaireCompteAutre) {
        this.codePostalTitulaireCompteAutre = codePostalTitulaireCompteAutre;
    }

    public String getCommuneTitulaireCompteAutre() {
        return communeTitulaireCompteAutre;
    }

    public void setCommuneTitulaireCompteAutre(String communeTitulaireCompteAutre) {
        this.communeTitulaireCompteAutre = communeTitulaireCompteAutre;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
