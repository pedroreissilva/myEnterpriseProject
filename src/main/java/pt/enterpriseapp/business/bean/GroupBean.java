package pt.enterpriseapp.business.bean;


import pt.enterpriseapp.entity.Group;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GroupBean {

    @PersistenceContext(unitName = "myEnterpriseApp")
    private EntityManager entityManager;



    public void save(Group group){
        entityManager.persist(group);
    }

}
