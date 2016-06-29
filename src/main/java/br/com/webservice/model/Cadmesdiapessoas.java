package br.com.webservice.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Cadmesdiapessoas {

    private static final long serialVersionUID = 1L;
    @Id    
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer cadmesdiaPessoasId;
    @Column(name = "cadmesdiaid")
    private String cadmesdiaId;
    private String nome;
    
    private String cadmesdiadate;
    private Integer idhora;
    
    private String status;


    public Integer getCadmesdiaPessoasId() {
        return cadmesdiaPessoasId;
    }

    public void setCadmesdiaPessoasId(Integer cadmesdiaPessoasId) {
        this.cadmesdiaPessoasId = cadmesdiaPessoasId;
    }

    public String getCadmesdiaId() {
        return cadmesdiaId;
    }

    public void setCadmesdiaId(String cadmesdiaId) {
        this.cadmesdiaId = cadmesdiaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return nome;
    }

	public String getCadmesdiadate() {
		return cadmesdiadate;
	}

	public void setCadmesdiadate(String cadmesdiadate) {
		this.cadmesdiadate = cadmesdiadate;
	}

	public Integer getIdhora() {
		return idhora;
	}

	public void setIdhora(Integer idhora) {
		this.idhora = idhora;
	}
	
	
    
    
}
