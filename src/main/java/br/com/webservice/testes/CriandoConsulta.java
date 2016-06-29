package br.com.webservice.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

import br.com.webservice.model.Cadmes;
import br.com.webservice.model.Cadmesdiapessoas;
import br.com.webservice.model.CarroDB;

public class CriandoConsulta {

	static EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("WebServiceSpring");
	static EntityManager manager = factory.createEntityManager();

	public static void main(String[] args) {
		Session session = manager.unwrap(Session.class);
		Cadmesdiapessoas cadmesdiapessoas = new Cadmesdiapessoas();
		cadmesdiapessoas.setCadmesdiaId("5");
		cadmesdiapessoas.setNome("testeeeee");
		cadmesdiapessoas.setCadmesdiadate("01/05/1996");
		
		inserirCadmesdiapessoas(cadmesdiapessoas);
				
				
//		List<Cadmes> lst = porIdCadmes(1);
///		List<Cadmesdiapessoas> lst1= porIdCadmespessoas();
		

	    System.out.println("ppppp");
		

	}
	

	public static void inserirCadmesdiapessoas(Cadmesdiapessoas cadmesdiapessoas) {
	    manager.getTransaction().begin();
	    manager.persist(cadmesdiapessoas);
	    manager.getTransaction().commit();
		
		//manager.close();
		
	}
	

	public static List<Cadmesdiapessoas> porIdCadmespessoas() {
		return manager
				.createQuery("from Cadmesdiapessoas ",
						Cadmesdiapessoas.class)
				.getResultList();
	}

	

}
