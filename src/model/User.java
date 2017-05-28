package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevge on 21.05.2017.
 */
public class User implements Element {
    private String id;
    private String password;
    private List<Task> tasks;

    {
        tasks = new ArrayList<>();
    }

    public User() {
    }

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static User parse(String s) {
        String[] split = s.split(";");
        return new User(split[0], split[1]);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
