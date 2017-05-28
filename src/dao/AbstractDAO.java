package dao;

import model.Element;
import model.User;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by yevge on 21.05.2017.
 */
@Singleton
public abstract class AbstractDAO<T extends Element> {
    private String dir = "r:/IdeaProjects/Serg/webjsf2105";

    protected abstract String filename();
    protected abstract Object parse(String string);

    private List elements = new ArrayList<>();

    @PostConstruct
    public void init() {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(dir, filename()));
            elements = reader.lines().map(this::parse).collect(toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public T find(Object id) {
        List<T> els = elements;
        return els.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

}
