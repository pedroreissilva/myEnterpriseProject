package pt.enterpriseapp.business.bean;


import pt.enterpriseapp.entity.Expense;
import pt.enterpriseapp.entity.Group;
import pt.enterpriseapp.entity.Request;
import pt.enterpriseapp.entity.User;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.Date;

@Startup
@Singleton
public class PopulateDB {

    @EJB
    private UserBean userBean;

    @EJB
    private ExpenseBean expenseBean;

    @EJB
    private GroupBean groupBean;

    @EJB
    private RequestBean requestBean;

    @PostConstruct
    public void populateDB(){



        User user = new User("pedro", "silva", "pedro@familycost.com", "pedro");
        userBean.save(user);
        User user2 = new User("jose", "silva", "jose@familycost.com", "jose");
        userBean.save(user2);
        User user3 = new User("maria", "silva", "maria@familycost.com", "maria");
        userBean.save(user3);


        Expense expense = new Expense(new Date(), "Compras Geral", 10 , user);
        expenseBean.save(expense);
        Expense expense2 = new Expense(new Date(), "Água", 12 , user);
        expenseBean.save(expense2);
        Expense expense3 = new Expense(new Date(), "Luz", 23 , user);
        expenseBean.save(expense3);
        Expense expense4 = new Expense(new Date(), "Electrecidade", 42 , user2);
        expenseBean.save(expense4);
        Expense expense5 = new Expense(new Date(), "Continente", 65 , user3);
        expenseBean.save(expense5);
        Expense expense6 = new Expense(new Date(), "Gasolio", 290, user3);
        expenseBean.save(expense6);

        Group group = new Group("Gang Informático", 1, user2);
        groupBean.save(group);
        Group group2 = new Group("Family", 1, user);
        groupBean.save(group2);
        Group group3 = new Group("ESTG EI", 2, user);
        group3.addUser(user2);
        groupBean.save(group3);

        Request request = new Request("dasdsa", user, user2, group2, 1);
        requestBean.save(request);

    }
}
