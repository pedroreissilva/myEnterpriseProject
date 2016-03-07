package pt.enterpriseapp.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GROUPS")
public class Group implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    @ManyToMany
    @JoinTable(name = "USER_VS_GROUP",
            joinColumns =
            @JoinColumn(name = "GROUP_ID", referencedColumnName = "ID"),
            inverseJoinColumns =
            @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    )
    private List<User> users;

    @NotNull
    private int type;

    @ManyToOne
    @NotNull
    private User user;


    public Group(){
        this.users = new ArrayList<User>();
    }

    public Group(String name, int type, User user){
        this.name = name;
        this.type = type;
        this.user = user;
        this.users = new ArrayList<User>();
        this.users.add(user);
    }


    public long getId() {
        return id;
    }

    public List<User> getUsers() {
        return users;
    }

    public String getName() {
        return name;
    }

    public void addUser(User user){
        this.users.add(user);
    }
}
