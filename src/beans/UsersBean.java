package beans;

import dao.UserDAO;
import model.User;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by yevge on 21.05.2017.
 */
@Named
@SessionScoped
public class UsersBean implements Serializable {
    @EJB
    UserDAO userDAO;

    User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String check() {
        User find = userDAO.find(user.getId());
        if (find == null || !find.getPassword().equals(user.getPassword())) return "error";
        else {
            return "ok";
        }
    }
}
