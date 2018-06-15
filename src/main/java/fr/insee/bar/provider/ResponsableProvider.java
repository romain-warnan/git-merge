package fr.insee.bar.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.insee.bar.dao.EmployeDao;
import fr.insee.bar.model.Agent;

@Profile("responsable")
@Component
public class ResponsableProvider implements EmployeProvider {

    @Autowired
    private EmployeDao employeDao;

    /**
     * Retourne un agent dont le rôle est "responsable"
     * */
    @Override
    public Agent provide() {
        return employeDao.find(Short.valueOf("3")).get();
    }

}
