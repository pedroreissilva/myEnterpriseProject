package pt.enterpriseapp.business.bean;


import pt.enterpriseapp.business.dto.UserDTO;
import pt.enterpriseapp.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class UserBean {

    @PersistenceContext(unitName = "myEnterpriseApp")
    private EntityManager entityManager;


    public void save(User user){
        entityManager.persist(user);
    }



    public List<UserDTO> getAllUsers(){
        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
        List<User> users = entityManager.createNamedQuery("User.findAll").getResultList();
        for(User user: users){
            UserDTO userDTO = new UserDTO(user.getId(), user.getEmail(), user.getPassword(), user.getFirstName());
            usersDTO.add(userDTO);
        }
        return usersDTO;
    }


}
