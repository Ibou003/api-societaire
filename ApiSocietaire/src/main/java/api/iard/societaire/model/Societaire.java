package api.iard.societaire.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "societaire", type = "societaire", shards = 1)
public class Societaire implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Numéro de sociétaire en numérique.
     */
//    documentation des models 
//    @ApiModelProperty(notes = "Numéro de sociétaire en numérique")
    @Id
    private Long numeroSocietaire;

    /**
     * Numéro de personne SIEBEL: 1-4KEQEZY.
     */
    private String identifiant;

    /**
     * Numéro de sociétaire formatté sur 8 digits avec la lettre clé: 6911396H.
     */
    private String numeroSocietaireFormate;

    /**
     * Code INSEE.
     */
    private Long codeInsee;

    /**
     * Lettre clé du sociétaire.
     */
    private String lettreCle;

    /**
     * Société du sociétaire: MAIF, FILIA MAIF, MSC.
     */
    private String societe;

    /**
     * Code société du sociétaire: 272 FILIA MAIF, 372 MAIF, 0 sans information.
     */
    private Long codeSociete;

    /**
     * Identifiant Maif Social Club.
     */
    private String identifiantMSC;

    /**
     * Date d'adhésion.
     */
    private String dateAdhesion;

    /**
     * Date d'adhésion à Maif Social Club.
     */
    private String dateAdhesionMSC;

    /**
     * Date radiation
     */
    private String dateRadiation;

    /**
     * Code radiation
     */
    private Integer codeRadiation;

    /**
     * code Personne
     */
    private Integer codePersonne;

    /**
     * code Sexe (1, 2)
     */
    private Integer codeSexe;

    /**
     * situation Particuliere Societaire
     */
    private String situationParticuliereSocietaire;

    /**
     * nom du Societaire
     */
    private String nomSocietaire;

    /**
     * Informations bancaires du sociétaire.
     */
//    @OneToOne(cascade = CascadeType.ALL)
    private InformationsBancaires informationsBancaire;

    /**
     * Statut du sociétaire: "Sociétaire", "Prospect / Potentiel", "Membre".
     */
    private String statut;

    /**
     * Code numeroPaysSurvenance.
     */
    private Integer numeroPaysSurvenance;

    /**
     * Code délégation départementale ex 7910.
     */
    private String codeDelegation;

    /**
     * Numero délégation ex 7901.
     */
    private String numeroDelegation;

    /**
     * Numéro d'adresse du domicile.
     */
    private Long numeroAdresseDomicile;

    /**
     * Situation de recouvrement (SREC).<br>
     * 00 Situation normale<br>
     * 01 Pré-mise en demeure<br>
     * 02 Mise en demeure<br>
     * 03 Radié ayant reçu un dernier RDC (relevé de compte)<br>
     * 04 Dernier avis envoyé avant poursuite<br>
     * 05 Contentieux 1ère phase<br>
     * 06 Contentieux 2ème phase<br>
     * 07 Contentieux 3ème phase<br>
     * 08 Transmis contentieux
     */
    private Long situationRecouvrement;

    /**
     * Situation sociétaire (SSOC).<br>
     * 0 Sans information<br>
     * 1 Sociétaire en cours<br>
     * 2 Sociétaire résidant à l'étranger en attente de l'enregistrement d'une
     * adresse en France<br>
     * 3 Sociétaire radié<br>
     * 4 Sociétaire annulé
     */
    private Long situationSocietaire;

    /**
     * Libellé situation societaire.<br>
     * 0 Sans information<br>
     * 1 en cours<br>
     * 2 Résidant étranger<br>
     * 3 radié <br>
     * 4 annulé<br>
     */
    private String libelleSituationSocietaire;

    /**
     * Code interdiction de mise à jour sociétaire (CINTMAJ).<br>
     * 0 Sans information<br>
     * 1 Pas d'interdiction<br>
     * 2 Interdiction<br>
     * 3 Interdiction VAM (PACS)<br>
     * 4 Interdiction RAQVAM (PRAXIS - NP)<br>
     * 5 Observation de la sinistralité en cours
     */
    private Long codeInterdictionMajSocietaire;

    /**
     * Code autorisation video tex CAUTVDX (0 ou 2).<br>
     * Code indiquant si l'utilisateur a le droit de faire des opérations en
     * ligne.
     */
    private Long codeAutorisationVideotex;

    /**
     * Avis échéance du sociétaire.<br>
     * Non renseigné si le sociétaire a adhéré après la dernière date d'émission
     * annuelle.
     */

//    @OneToOne(cascade = CascadeType.ALL)
    private AvisEcheance avisEcheance;

    /**
     * Code Origine Affectation Societe
     */
    private Integer codeOrigineAffectationSociete;

    /**
     * Code employeur
     */
    private Integer codeEmployeur;

    /**
     * dateDebutSuspensionRisque
     */
    private String dateDebutSuspensionRisque;

    /**
     * l'adresse societaire celle-ci va etre objet d'une modification
     */
//    @OneToOne(cascade = CascadeType.ALL)
    // @JsonIgnore
    private AdresseSocietaire adresseSocietaire;

    /**
     * @return the adresseSocietaire
     */
    public AdresseSocietaire getAdresseSocietaire() {
        return adresseSocietaire;
    }

    /**
     * @param adresseSocietaire
     *            the adresseSocietaire to set
     */
    public void setAdresseSocietaire(AdresseSocietaire adresseSocietaire) {
        this.adresseSocietaire = adresseSocietaire;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNumeroSocietaireFormate() {
        return numeroSocietaireFormate;
    }

    public void setNumeroSocietaireFormate(String numeroSocietaireFormate) {
        this.numeroSocietaireFormate = numeroSocietaireFormate;
    }

    public Long getNumeroSocietaire() {
        return numeroSocietaire;
    }

    public void setNumeroSocietaire(Long numeroSocietaire) {
        this.numeroSocietaire = numeroSocietaire;
    }

    public Long getCodeInsee() {
        return codeInsee;
    }

    public void setCodeInsee(Long codeInsee) {
        this.codeInsee = codeInsee;
    }

    public String getLettreCle() {
        return lettreCle;
    }

    public void setLettreCle(String lettreCle) {
        this.lettreCle = lettreCle;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public Long getCodeSociete() {
        return codeSociete;
    }

    public void setCodeSociete(Long codeSociete) {
        this.codeSociete = codeSociete;
    }

    public String getIdentifiantMSC() {
        return identifiantMSC;
    }

    public void setIdentifiantMSC(String identifiantMSC) {
        this.identifiantMSC = identifiantMSC;
    }

    public String getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(String dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }

    public String getDateAdhesionMSC() {
        return dateAdhesionMSC;
    }

    public void setDateAdhesionMSC(String dateAdhesionMSC) {
        this.dateAdhesionMSC = dateAdhesionMSC;
    }

    public String getDateRadiation() {
        return dateRadiation;
    }

    public void setDateRadiation(String dateRadiation) {
        this.dateRadiation = dateRadiation;
    }

    public Integer getCodeRadiation() {
        return codeRadiation;
    }

    public void setCodeRadiation(Integer codeRadiation) {
        this.codeRadiation = codeRadiation;
    }

    public Integer getCodePersonne() {
        return codePersonne;
    }

    public void setCodePersonne(Integer codePersonne) {
        this.codePersonne = codePersonne;
    }

    public Integer getCodeSexe() {
        return codeSexe;
    }

    public void setCodeSexe(Integer codeSexe) {
        this.codeSexe = codeSexe;
    }

    public String getSituationParticuliereSocietaire() {
        return situationParticuliereSocietaire;
    }

    public void setSituationParticuliereSocietaire(String situationParticuliereSocietaire) {
        this.situationParticuliereSocietaire = situationParticuliereSocietaire;
    }

    public String getNomSocietaire() {
        return nomSocietaire;
    }

    public void setNomSocietaire(String nomSocietaire) {
        this.nomSocietaire = nomSocietaire;
    }

    public InformationsBancaires getInformationsBancaire() {
        return informationsBancaire;
    }

    public void setInformationsBancaire(InformationsBancaires informationsBancaire) {
        this.informationsBancaire = informationsBancaire;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Integer getNumeroPaysSurvenance() {
        return numeroPaysSurvenance;
    }

    public void setNumeroPaysSurvenance(Integer numeroPaysSurvenance) {
        this.numeroPaysSurvenance = numeroPaysSurvenance;
    }

    public String getCodeDelegation() {
        return codeDelegation;
    }

    public void setCodeDelegation(String codeDelegation) {
        this.codeDelegation = codeDelegation;
    }

    public String getNumeroDelegation() {
        return numeroDelegation;
    }

    public void setNumeroDelegation(String numeroDelegation) {
        this.numeroDelegation = numeroDelegation;
    }

    public Long getNumeroAdresseDomicile() {
        return numeroAdresseDomicile;
    }

    public void setNumeroAdresseDomicile(Long numeroAdresseDomicile) {
        this.numeroAdresseDomicile = numeroAdresseDomicile;
    }

    public Long getSituationRecouvrement() {
        return situationRecouvrement;
    }

    public void setSituationRecouvrement(Long situationRecouvrement) {
        this.situationRecouvrement = situationRecouvrement;
    }

    public Long getSituationSocietaire() {
        return situationSocietaire;
    }

    public void setSituationSocietaire(Long situationSocietaire) {
        this.situationSocietaire = situationSocietaire;
    }

    public String getLibelleSituationSocietaire() {
        return libelleSituationSocietaire;
    }

    public void setLibelleSituationSocietaire(String libelleSituationSocietaire) {
        this.libelleSituationSocietaire = libelleSituationSocietaire;
    }

    public Long getCodeInterdictionMajSocietaire() {
        return codeInterdictionMajSocietaire;
    }

    public void setCodeInterdictionMajSocietaire(Long codeInterdictionMajSocietaire) {
        this.codeInterdictionMajSocietaire = codeInterdictionMajSocietaire;
    }

    public Long getCodeAutorisationVideotex() {
        return codeAutorisationVideotex;
    }

    public void setCodeAutorisationVideotex(Long codeAutorisationVideotex) {
        this.codeAutorisationVideotex = codeAutorisationVideotex;
    }

    public AvisEcheance getAvisEcheance() {
        return avisEcheance;
    }

    public void setAvisEcheance(AvisEcheance avisEcheance) {
        this.avisEcheance = avisEcheance;
    }

    public Integer getCodeOrigineAffectationSociete() {
        return codeOrigineAffectationSociete;
    }

    public void setCodeOrigineAffectationSociete(Integer codeOrigineAffectationSociete) {
        this.codeOrigineAffectationSociete = codeOrigineAffectationSociete;
    }

    public Integer getCodeEmployeur() {
        return codeEmployeur;
    }

    public void setCodeEmployeur(Integer codeEmployeur) {
        this.codeEmployeur = codeEmployeur;
    }

    public String getDateDebutSuspensionRisque() {
        return dateDebutSuspensionRisque;
    }

    public void setDateDebutSuspensionRisque(String dateDebutSuspensionRisque) {
        this.dateDebutSuspensionRisque = dateDebutSuspensionRisque;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Societaire { numeroSocietaire=" + numeroSocietaire + ", identifiant=" + identifiant + ", numeroSocietaireFormate="
                + numeroSocietaireFormate + ", codeInsee=" + codeInsee + ", lettreCle=" + lettreCle + ", societe=" + societe + ", codeSociete="
                + codeSociete + ", identifiantMSC=" + identifiantMSC + ", dateAdhesion=" + dateAdhesion + ", dateAdhesionMSC=" + dateAdhesionMSC
                + ", dateRadiation=" + dateRadiation + ", codeRadiation=" + codeRadiation + ", codePersonne=" + codePersonne + ", codeSexe="
                + codeSexe + ", situationParticuliereSocietaire=" + situationParticuliereSocietaire + ", nomSocietaire=" + nomSocietaire
                + ", informationsBancaire=" + informationsBancaire + ", statut=" + statut + ", numeroPaysSurvenance=" + numeroPaysSurvenance
                + ", codeDelegation=" + codeDelegation + ", numeroDelegation=" + numeroDelegation + ", numeroAdresseDomicile=" + numeroAdresseDomicile
                + ", situationRecouvrement: " + situationRecouvrement + ", situationSocietaire=" + situationSocietaire
                + ", libelleSituationSocietaire: " + libelleSituationSocietaire + ", codeInterdictionMajSocietaire=" + codeInterdictionMajSocietaire
                + ", codeAutorisationVideotex: " + codeAutorisationVideotex + ", avisEcheance: " + avisEcheance + ", codeOrigineAffectationSociete="
                + codeOrigineAffectationSociete + ", codeEmployeur: " + codeEmployeur + ", dateDebutSuspensionRisque=" + dateDebutSuspensionRisque
                + ", adresseSocietaire : " + adresseSocietaire + "}";
    }

    // public ObservationSIPI getObservationSipi() {
    // return observationSipi;
    // }
    //
    // public void setObservationSipi(ObservationSIPI observationSipi) {
    // this.observationSipi = observationSipi;
    // }

}
