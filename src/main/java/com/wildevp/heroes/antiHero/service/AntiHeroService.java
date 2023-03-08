package com.wildevp.heroes.antiHero.service;

import com.wildevp.heroes.antiHero.entity.AntiHeroEntity;
import com.wildevp.heroes.antiHero.repository.AntiHeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
@AllArgsConstructor
@Service
public class AntiHeroService {
    private final AntiHeroRepository repository;
    public Iterable<AntiHeroEntity> findAllAntiHeroes() {
        return repository.findAll();
    }
    public AntiHeroEntity findAntiHeroById(UUID id) {
        return findAntiHeroById(id);
    }
    public void removeAntiHeroById(UUID id) {
        repository.deleteById(id);
    }
    public AntiHeroEntity addAntiHero(AntiHeroEntity antiHero) {
        return repository.save(antiHero);
    }
    public void updateAntiHero(UUID id, AntiHeroEntity antiHero) {
        repository.save(antiHero);
    }
}
