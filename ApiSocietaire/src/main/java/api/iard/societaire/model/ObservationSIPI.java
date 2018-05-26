package api.iard.societaire.model;

import java.io.Serializable;
import java.util.List;

public class ObservationSIPI implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -1986379812355745217L;

    /**
     * Actions connu.
     */
    private List<Actions> actions;

    public List<Actions> getActions() {
        return actions;
    }

    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
