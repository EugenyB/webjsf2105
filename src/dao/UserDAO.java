package dao;

import model.User;

import javax.ejb.Singleton;

@Singleton
public class UserDAO extends AbstractDAO<User> {

    @Override
    protected String filename() {
        return "user.csv";
    }

    @Override
    protected Object parse(String string) {
        return User.parse(string);
    }
}
