package pt.enterpriseapp.business.dto;

import pt.enterpriseapp.entity.User;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "group")
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupDTO {

    private long id;
    private String name;
    private List<User> users;
    private int type;
    private User user;


    public GroupDTO(){
        this.users = new ArrayList<User>();
    }

    public GroupDTO(long id, String name, int type, User user){
        this.id = id;
        this.name = name;
        this.type = type;
        this.user = user;
        this.users = new ArrayList<User>();
        this.users.add(user);
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public int getType() {
        return type;
    }

    public User getUser() {
        return user;
    }
}
