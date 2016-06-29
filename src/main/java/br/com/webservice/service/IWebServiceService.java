package br.com.webservice.service;

import java.util.List;

import br.com.webservice.model.Cadmesdiahora;
import br.com.webservice.model.Cadmesdiapessoas;

public interface IWebServiceService {
	
	public List<Cadmesdiapessoas> getListCarro();
	
	Boolean inserirCadmesdiapessoas(Cadmesdiapessoas cadmesdiapessoas);
	
	Boolean inserirCadmesdiahora(Cadmesdiahora cadmesdiahora);
		
	Boolean delete(Integer id);


}
