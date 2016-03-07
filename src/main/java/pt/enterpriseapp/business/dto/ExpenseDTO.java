package pt.enterpriseapp.business.dto;

import pt.enterpriseapp.entity.Expense;
import pt.enterpriseapp.entity.User;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "expense")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExpenseDTO {

    private long id;
    private Date date;
    private String category;
    private double cost;
    private UserDTO userDTO;

    public ExpenseDTO(){

    }

    public ExpenseDTO(long id, Date date, String category, double cost, UserDTO userDTO){
        this.id = id;
        this.date = date;
        this.category = category;
        this.cost = cost;
        this.userDTO = userDTO;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public UserDTO getUser() {
        return userDTO;
    }
}
