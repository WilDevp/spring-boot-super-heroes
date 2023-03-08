package com.wildevp.heroes.antiHero.repository;

import com.wildevp.heroes.antiHero.entity.AntiHeroEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AntiHeroRepository  extends CrudRepository<AntiHeroEntity, UUID> {
}
