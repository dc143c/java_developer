package com.digital.innovation.one.spring.mvc.rest;
import com.digital.innovation.one.spring.mvc.exception.JediNotFoundException;
import com.digital.innovation.one.spring.mvc.model.Jedi;
import com.digital.innovation.one.spring.mvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class JediResources {

    @Autowired
    private JediRepository repository;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){
        return repository.getAll();
    }

    @GetMapping("/api/jedi/{name}")
    public ResponseEntity<List<Jedi>> getJediById(@PathVariable("name") String name){
        List<Jedi> results = repository.getAll().stream().filter(it -> {
            String nome = it.getName();
            return nome.equals(name);
        }).collect(Collectors.toList());

        if(results.size() > 0){
            return ResponseEntity.ok(results);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/api/jedi/")
    public Jedi createJedi(@Valid @RequestBody Jedi jedi){
        return repository.add(jedi);
    }


    @PutMapping("/api/jedi/{name}&{lastName}")
    public Jedi putJedi(@PathVariable("name") String name, @PathVariable("lastName") String lastName, @Valid @RequestBody Jedi jedi){
        List<Jedi> results = repository.getAll().stream().filter(it -> {
            String nome = it.getName();
            String sobrenome = it.getLastName();
            return nome.equals(name) & sobrenome.equals(lastName);
        }).collect(Collectors.toList());
        Jedi jediBuscado = results.get(1);

        jediBuscado.setName(name);
        jediBuscado.setLastName(lastName);

        return jediBuscado;
    }
}

