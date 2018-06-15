package fr.insee.bar.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.insee.bar.dao.EmployeDao;
import fr.insee.bar.model.Employe;

@Profile("serveur")
@Component
public class ServeurProvider implements EmployeProvider {

	@Autowired
	private EmployeDao employeDao;


	/**
	 * Retourne un agent dont le rôle est "serveur"
	 * */
	@Override
	public Employe provide() {
		return employeDao.find(Short.valueOf("2")).get();
	}

}
