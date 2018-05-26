package api.iard.societaire.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdresseSocietaire implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6759286966970394095L;

    @Id
    private String codePostal;
    private String commune;
    private String departement;
    private String adresse1;
    private String adresse2;

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AdresseSocietaire { codePostal : " + codePostal + ", commune :" + commune + ", departement :" + departement + ", adresse1 :"
                + adresse1 + ", adresse2 :" + adresse2 + "}";
    }

}
