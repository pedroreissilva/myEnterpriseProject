package pt.enterpriseapp.business.dto;


import pt.enterpriseapp.entity.Expense;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "expense")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDTO {

    private long id;
    private String email;
    private String password;
    private String firstName;
    private List<ExpenseDTO> expensesDTO;
    private List<GroupDTO> groupsDTO;


    public UserDTO(){
        this.expensesDTO = new ArrayList<ExpenseDTO>();
        this.groupsDTO = new ArrayList<GroupDTO>();
    }

    public UserDTO(long id, String email, String password, String firstname){
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstname;
        this.expensesDTO = new ArrayList<ExpenseDTO>();
        this.groupsDTO = new ArrayList<GroupDTO>();
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<ExpenseDTO> getExpenses() {
        return expensesDTO;
    }

    public void setExpenses(List<ExpenseDTO> expenses) {
        this.expensesDTO = expenses;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<ExpenseDTO> getExpensesDTO() {
        return expensesDTO;
    }

    public List<GroupDTO> getGroupsDTO() {
        return groupsDTO;
    }
}
