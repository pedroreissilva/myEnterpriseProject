package pt.enterpriseapp.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EXPENSE")
@NamedQueries({
        @NamedQuery(name = "findUserExpenses", query = "SELECT e FROM Expense e WHERE e.user.id = :userId"),
        @NamedQuery(name = "findExpenses", query = "SELECT e FROM Expense e ")
})
public class Expense implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date date;

    @NotNull
    @Size(min = 2, max = 255)
    private String category;

    @NotNull
    private double cost;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_USER", nullable = false)
    private User user;

    public Expense(){
    }

    public Expense(Date date, String category, double cost, User user){
        this.date = date;
        this.category = category;
        this.cost = cost;
        this.user = user;
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

    public User getUser() {
        return user;
    }
}
