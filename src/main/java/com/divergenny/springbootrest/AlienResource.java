package com.divergenny.springbootrest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienResource {
    final AlienRepository repo;

    public AlienResource(AlienRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/aliens")
    public List<Alien> getAliens() {
        List<Alien> aliens = (List<Alien>) repo.findAll();
        return aliens;
    }

    @GetMapping("/aliens/{id}")
    public Alien getAlien(@PathVariable Long id) {
        return repo.findAlienById(id);
    }

    @PostMapping("/aliens")
    public Alien createAlien(@RequestBody Alien alien) {
        if (getAlien(alien.getId()).getId() != 0) {
            repo.save(alien);
        }
        return alien;
    }

    @PutMapping
    public Alien updateOrCreateAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }

    @DeleteMapping("/alien/delete/{id}")
    public Alien deleteAlien(@PathVariable("id") long id) {
        Alien alien = getAlien(id);
        repo.deleteById(id);
        return alien;
    }
}
