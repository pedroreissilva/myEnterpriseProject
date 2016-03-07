package pt.enterpriseapp.business.bean;


import pt.enterpriseapp.business.dto.ExpenseDTO;
import pt.enterpriseapp.business.dto.UserDTO;
import pt.enterpriseapp.entity.Expense;
import pt.enterpriseapp.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ExpenseBean {

    @PersistenceContext(unitName = "myEnterpriseApp")
    private EntityManager entityManager;


    public void save(Expense expense){
        entityManager.persist(expense);
    }

    public void addExpense(ExpenseDTO expenseDTO, UserDTO userDTO){
        User user = entityManager.find(User.class, userDTO.getId());
        if(user != null){
            Expense expense = new Expense(expenseDTO.getDate(), expenseDTO.getCategory(), expenseDTO.getCost(), user);
            entityManager.persist(expense);
        }

    }

    public List<ExpenseDTO> getUserExpense(long id){
        List<ExpenseDTO> expensesDTO = new ArrayList<ExpenseDTO>();
        User user = entityManager.find(User.class, id);
        if(user != null){
            UserDTO userDTO = new UserDTO(user.getId(), user.getEmail(), user.getPassword(), user.getFirstName());
            List<Expense> expenses = entityManager.createNamedQuery("findUserExpenses").setParameter("userId", user.getId()).getResultList();
            if(expenses != null){
                for(Expense expense: expenses){
                    ExpenseDTO expenseDTO = new ExpenseDTO(expense.getId(), expense.getDate(), expense.getCategory(), expense.getCost(), userDTO);
                    expensesDTO.add(expenseDTO);
                }
            }
        }
        return expensesDTO;
    }
}
