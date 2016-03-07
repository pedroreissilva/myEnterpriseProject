package pt.enterpriseapp.business.dto;

import pt.enterpriseapp.entity.Group;
import pt.enterpriseapp.entity.User;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestDTO {

    private long id;
    private String message;
    private User owner;
    private User guest;
    private Group group;
    private int state;


    public RequestDTO(){

    }

    public RequestDTO(long id, String message, User owner, User guest, Group group, int state){
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
