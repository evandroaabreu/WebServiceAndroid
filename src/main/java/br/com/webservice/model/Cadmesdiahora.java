package br.com.webservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by eabreu on 06/10/2015.
 */
@Entity
@XmlRootElement
public class Cadmesdiahora {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idHora;
	private Integer cadmesdiaid;
	private String cadmesdiahora;
	private String cadmesdiatype;
	public Integer getIdHora() {
		return idHora;
	}
	public void setIdHora(Integer idHora) {
		this.idHora = idHora;
	}
	public Integer getCadmesdiaid() {
		return cadmesdiaid;
	}
	public void setCadmesdiaid(Integer cadmesdiaid) {
		this.cadmesdiaid = cadmesdiaid;
	}
	public String getCadmesdiahora() {
		return cadmesdiahora;
	}
	public void setCadmesdiahora(String cadmesdiahora) {
		this.cadmesdiahora = cadmesdiahora;
	}
	public String getCadmesdiatype() {
		return cadmesdiatype;
	}
	public void setCadmesdiatype(String cadmesdiatype) {
		this.cadmesdiatype = cadmesdiatype;
	}
	
	
	
	

}
