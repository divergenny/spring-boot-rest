package com.divergenny.springbootrest;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends CrudRepository<Alien, Long> {
    Alien findAlienById(Long id);

    Alien save(Alien alien);
}
