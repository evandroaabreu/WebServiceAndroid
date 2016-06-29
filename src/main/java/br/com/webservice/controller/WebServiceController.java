package br.com.webservice.controller;


import java.util.List;

import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.webservice.model.Cadmesdiahora;
import br.com.webservice.model.Cadmesdiapessoas;
import br.com.webservice.model.Response;
import br.com.webservice.service.WebServiceService;
@RestController
@RequestMapping("/web")
public class WebServiceController { 
	

	
	@Autowired
	private WebServiceService webServiceService;

	
	@RequestMapping(method = RequestMethod.GET)
	public List<Cadmesdiapessoas> getTodosCarros() {
		return webServiceService.getListCarro();
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Response salvaWeb(@RequestBody Cadmesdiapessoas cadmesdiapessoas) {
		Boolean status = webServiceService.inserirCadmesdiapessoas(cadmesdiapessoas);	
		if(status) {
			return Response.Ok("Cadmesdiapessoas incluido com sucesso");
		} else {
	
			return Response.Error("Erro ao incluido Cadmesdiapessoas");
		}		
	}
	
	@RequestMapping(value= "/salvaHora", method = RequestMethod.POST)
	public Response salvaTipoHora(@RequestBody Cadmesdiahora cadmesdiahora) {
		Boolean status = webServiceService.inserirCadmesdiahora(cadmesdiahora);
		if(status) {
			return Response.Ok("Cadmesdiapessoas incluido com sucesso");
		} else {
	
			return Response.Error("Erro ao incluido Cadmesdiapessoas");
		}	
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Response deletaPessoas(@PathVariable Integer id) {
		Boolean status = webServiceService.delete(id);
		if(status) {
			return Response.Ok("Carro deletado com sucesso");
		} else {
			return Response.Error("Erro ao deletar carro");
		}
		
	}
	
}