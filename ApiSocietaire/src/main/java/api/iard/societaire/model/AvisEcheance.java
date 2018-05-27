package api.iard.societaire.model;

import java.io.Serializable;
import java.net.URI;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

//@Entity
@Document(indexName = "avisEcheance", type = "avisEcheance", shards = 1)
public class AvisEcheance implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Type relation ("avis-echeance").
     */
//
    @Id
//    @GeneratedValue
    private Long id;

    private String rel;

    /**
     * Lien vers la REST URI du document avis échéance.
     */
    private URI link;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public URI getLink() {
        return link;
    }

    public void setLink(URI link) {
        this.link = link;
    }

}
