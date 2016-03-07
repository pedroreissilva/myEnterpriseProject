package pt.enterpriseapp.boundary;

import pt.enterpriseapp.business.bean.UserBean;
import pt.enterpriseapp.business.dto.UserDTO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Stateless
@Path("user")
public class UserApi {

    @EJB
    private UserBean userBean;


    @GET
    @Path("all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<UserDTO> getAllUsers(){
        return userBean.getAllUsers();
    }

    @GET
    public String getName(){
        return "Silva";
    }

    @GET
    @Path("username")
    @Produces("application/json")
    public String getUserame(){

        return "{\"username\": \"Pedro Silva\"}";
    }

    @GET
    @Path("password")
    @Produces("application/json")
    public String getPassword(){
        return "password: password";
    }
    @GET
    @Path("coisas")
    @Produces("application/json")
    public String getCoisas(){
        return "coisas: coisas";
    }

}
