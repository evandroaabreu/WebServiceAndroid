package br.com.webservice.DAO;

import java.util.List;

import br.com.webservice.model.Cadmesdiahora;
import br.com.webservice.model.Cadmesdiapessoas;

public interface IWebServiceDaoRepo {

	List<Cadmesdiapessoas> getListCadmesPessoas();
	
	public Boolean inserirCadmesdiapessoas(Cadmesdiapessoas cadmesdiapessoas);
	
	public Boolean inserirCadmesdiahora(Cadmesdiahora cadmesdiahora);
	
	public Cadmesdiapessoas getPessoasPorId(Integer id);
	
	Boolean delete(Integer id);
	
}
