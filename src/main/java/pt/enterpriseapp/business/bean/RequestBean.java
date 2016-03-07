package pt.enterpriseapp.business.bean;


import pt.enterpriseapp.entity.Request;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RequestBean {

    @PersistenceContext(unitName = "myEnterpriseApp")
    private EntityManager entityManager;

    public void save(Request request){
        entityManager.persist(request);
    }
}
