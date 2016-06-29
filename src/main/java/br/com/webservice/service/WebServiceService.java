package br.com.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webservice.DAO.WebServiceDaoRepo;
import br.com.webservice.model.Cadmesdiahora;
import br.com.webservice.model.Cadmesdiapessoas;

@Service
public class WebServiceService implements IWebServiceService{
	
	@Autowired
	private WebServiceDaoRepo webServiceDaoRepo;
	
	
	@Override
	public List<Cadmesdiapessoas> getListCarro() {
		return webServiceDaoRepo.getListCadmesPessoas();
	}


	@Override
	public Boolean inserirCadmesdiapessoas(Cadmesdiapessoas cadmesdiapessoas) {
		return webServiceDaoRepo.inserirCadmesdiapessoas(cadmesdiapessoas);
	}


	@Override
	public Boolean inserirCadmesdiahora(Cadmesdiahora cadmesdiahora) {
		return webServiceDaoRepo.inserirCadmesdiahora(cadmesdiahora);
	}


	@Override
	public Boolean delete(Integer id) {
		return webServiceDaoRepo.delete(id);
	}

}
