package br.com.webservice.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import br.com.webservice.model.Cadmes;
import br.com.webservice.model.Cadmesdiahora;
import br.com.webservice.model.Cadmesdiapessoas;
import br.com.webservice.model.CarroDB;

@Repository
public class WebServiceDaoRepo implements IWebServiceDaoRepo {

	EntityManagerFactory factory = null;
	EntityManager manager = null;

	public WebServiceDaoRepo() {
		factory = Persistence.createEntityManagerFactory("WebServiceSpring");
		manager = factory.createEntityManager();

	}

	@Override
	public List<Cadmesdiapessoas> getListCadmesPessoas() {
		return manager.createQuery("select c from Cadmesdiapessoas c", Cadmesdiapessoas.class).getResultList();
	}
	
	@Override
	public Boolean inserirCadmesdiapessoas(Cadmesdiapessoas cadmesdiapessoas) {

		try {
			manager.getTransaction().begin();
			Boolean findCar = false;

			if (cadmesdiapessoas.getCadmesdiaId() == null) {
				findCar = true;
			} else {
				findCar = false;
			}
			if (!findCar) {
				manager.merge(cadmesdiapessoas);
			} else {
				manager.persist(cadmesdiapessoas);
			}
			manager.getTransaction().commit();

			return true;

		} catch (Exception e) {
			if (manager.getTransaction().isActive()) {
				manager.getTransaction().rollback();
			}

			return false;
		}
	}

	@Override
	public Boolean inserirCadmesdiahora(Cadmesdiahora cadmesdiahora) {
		try {
			manager.getTransaction().begin();
		    manager.merge(cadmesdiahora);
			manager.getTransaction().commit();

			return true;

		} catch (Exception e) {
			if (manager.getTransaction().isActive()) {
				manager.getTransaction().rollback();
			}

			return false;
		}
	}
	
	public Cadmesdiapessoas getPessoasPorId(Integer id) {
		return manager.find(Cadmesdiapessoas.class, id);
	}

	@Override
	public Boolean delete(Integer id) {
		Cadmesdiapessoas cadmesdiapessoas = new Cadmesdiapessoas();
		cadmesdiapessoas = getPessoasPorId(id);

		try {
			manager.getTransaction().begin();
			manager.remove(cadmesdiapessoas);
			manager.getTransaction().commit();

			return true;

		} catch (Exception e) {

			return false;
		}
	}

}
