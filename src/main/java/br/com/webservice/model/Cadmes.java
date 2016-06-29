package br.com.webservice.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Cadmes  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer Id;
    @Column(name = "cad_name", nullable = true, length = 500)
    private String cadName;
  ///  private Collection<Cadmesdia> cadmesdiaCollection;
    @Column(name = "cad_mes_ano", nullable = true, length = 500)
    private String cadMesANO;

    public Cadmes() {
    }

    public Cadmes(Integer cadId) {
        this.Id = cadId;
    }

    public Cadmes(Integer cadId, String cadName) {
        this.Id = cadId;
        this.cadName = cadName;
    }

    public Integer getCadId() {
        return Id;
    }

    public void setCadId(Integer cadId) {
        this.Id = cadId;
    }

    public String getCadName() {
        return cadName;
    }

    public void setCadName(String cadName) {
        this.cadName = cadName;
    }

/*    public Collection<Cadmesdia> getCadmesdiaCollection() {
        return cadmesdiaCollection;
    }

    public void setCadmesdiaCollection(Collection<Cadmesdia> cadmesdiaCollection) {
        this.cadmesdiaCollection = cadmesdiaCollection;
    }
*/
    public String getCadMesANO() {
        return cadMesANO;
    }

    public void setCadMesANO(String cadMesANO) {
        this.cadMesANO = cadMesANO;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Id != null ? Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadmes)) {
            return false;
        }
        Cadmes other = (Cadmes) object;
        if ((this.Id == null && other.Id != null) || (this.Id != null && !this.Id.equals(other.Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return cadName;
    }

}
