package com.digital.innovation.one.spring.mvc.repository;

import java.util.ArrayList;
import java.util.List;

import com.digital.innovation.one.spring.mvc.model.Jedi;
import org.springframework.stereotype.Repository;

@Repository
public class JediRepository {

    private List<Jedi> jedi;

    public JediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywalker"));
        jedi.add(new Jedi("Obi-Wan", "Kenobi"));
        jedi.add(new Jedi("Qui-Gon", "Jinn"));
    }

    public List<Jedi> getAll() {
        return jedi;
    }

    public Jedi add(final Jedi jedi) {
        this.jedi.add(jedi);
        return jedi;
    }
}