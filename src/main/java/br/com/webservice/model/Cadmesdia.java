package br.com.webservice.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by eabreu on 06/10/2015.
 */
public class Cadmesdia  implements Serializable {

    public static String TABELA = "CADMESDIA";

    public static String ID = "_id";
    public static String CADMESDIA_TYPE = "CADMESDIA_TYPE";
    public static String CADMESDIA_DATE = "CADMESDIA_DATE";
    public static String CADMESANO = "CAD_MES_ANO";
    public static String STATUS = "STATUS";

    private static final long serialVersionUID = 1L;

    private Integer cadmesdiaId;
    private String cadmesdiaType;
    ///private Date cadmesdiaDate;
    private String cadmesdiaDate;
    private Cadmes cadmesId;
    private String cadmesAno;
    private String status;

    public Cadmesdia() {
    }

    public Cadmesdia(Integer cadmesdiaId) {
        this.cadmesdiaId = cadmesdiaId;
    }

    public Cadmesdia(Integer cadmesdiaId, String cadmesdiaType) {
        this.cadmesdiaId = cadmesdiaId;
        this.cadmesdiaType = cadmesdiaType;
    }

    public Integer getCadmesdiaId() {
        return cadmesdiaId;
    }

    public void setCadmesdiaId(Integer cadmesdiaId) {
        this.cadmesdiaId = cadmesdiaId;
    }

    public String getCadmesdiaType() {
        return cadmesdiaType;
    }

    public void setCadmesdiaType(String cadmesdiaType) {
        this.cadmesdiaType = cadmesdiaType;
    }

    public String getCadmesdiaDate() {
        return cadmesdiaDate;
    }

    public void setCadmesdiaDate(String cadmesdiaDate) {
        this.cadmesdiaDate = cadmesdiaDate;
    }

    public Cadmes getCadmesId() {
        return cadmesId;
    }

    public void setCadmesId(Cadmes cadmesId) {
        this.cadmesId = cadmesId;
    }

    public String getCadmesAno() {
        return cadmesAno;
    }

    public void setCadmesAno(String cadmesAno) {
        this.cadmesAno = cadmesAno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cadmesdiaId != null ? cadmesdiaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadmesdia)) {
            return false;
        }
        Cadmesdia other = (Cadmesdia) object;
        if ((this.cadmesdiaId == null && other.cadmesdiaId != null) || (this.cadmesdiaId != null && !this.cadmesdiaId.equals(other.cadmesdiaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //DateFormat dfMesAno = new SimpleDateFormat("dd/MM/yyyy");
        //String mesAno = dfMesAno.format(cadmesdiaDate);

        return cadmesdiaDate+" ( "+cadmesdiaType+" ) ";
    }


}
