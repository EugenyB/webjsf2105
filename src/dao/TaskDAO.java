package dao;

import model.Task;

/**
 * Created by yevge on 28.05.2017.
 */
public class TaskDAO extends AbstractDAO<Task> {
    @Override
    protected String filename() {
        return "task.csv";
    }

    @Override
    protected Object parse(String string) {
        return Task.parse(string);
    }
}
