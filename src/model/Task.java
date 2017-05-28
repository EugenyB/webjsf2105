package model;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by yevge on 28.05.2017.
 */
public class Task implements Element {
    private Integer id;
    private String title;
    private LocalDate dateOfIssue;
    private Period toEnd;
    private User user;

    @Override
    public Integer getId() {
        return id;
    }

    public Task() {
    }

    public Task(Integer id, String title, LocalDate dateOfIssue, Period toEnd) {
        this.id = id;
        this.title = title;
        this.dateOfIssue = dateOfIssue;
        this.toEnd = toEnd;
    }

    public Task(Integer id, String title, LocalDate dateOfIssue, Period toEnd, User user) {
        this.id = id;
        this.title = title;
        this.dateOfIssue = dateOfIssue;
        this.toEnd = toEnd;
        this.user = user;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Period getToEnd() {
        return toEnd;
    }

    public void setToEnd(Period toEnd) {
        this.toEnd = toEnd;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        user.getTasks().add(this);
    }
}
