package pt.enterpriseapp.boundary;


import pt.enterpriseapp.business.bean.ExpenseBean;
import pt.enterpriseapp.business.dto.ExpenseDTO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Stateless
@Path("expense")
public class ExpenseApi {

    @EJB
    private ExpenseBean expenseBean;


    @GET
    @Path("user/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<ExpenseDTO> getUserExpense(@PathParam("id") long id){
        return expenseBean.getUserExpense(id);
    }




}
