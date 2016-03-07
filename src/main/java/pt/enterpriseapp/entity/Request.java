package pt.enterpriseapp.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "REQUEST")
public class Request implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String message;

    @NotNull
    @ManyToOne
    private User owner;

    @NotNull
    @ManyToOne
    private User guest;

    @NotNull
    @ManyToOne
    private Group group;

    @NotNull
    @Max(5)
    @Min(1)
    private int state;

    public Request(){

    }

    public Request(String message, User owner, User guest, Group group, int state){
        this.message = message;
        this.owner = owner;
        this.guest = guest;
        this.group = group;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public User getOwner() {
        return owner;
    }

    public User getGuest() {
        return guest;
    }

    public Group getGroup() {
        return group;
    }

    public int getState() {
        return state;
    }
}
