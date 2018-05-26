package api.iard.societaire.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actions implements Serializable {
    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -1602450634542627804L;

    /**
     * Numero de motif prioritaire connu.
     */
    @Id
    private Long numeroMotifPrioritaire;

    public Long getNumeroMotifPrioritaire() {
        return numeroMotifPrioritaire;
    }

    public void setNumeroMotifPrioritaire(Long numeroMotifPrioritaire) {
        this.numeroMotifPrioritaire = numeroMotifPrioritaire;
    }

    public Long getTypeDecisionAction() {
        return typeDecisionAction;
    }

    public void setTypeDecisionAction(Long typeDecisionAction) {
        this.typeDecisionAction = typeDecisionAction;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Type decision action.
     */
    private Long typeDecisionAction;

}
