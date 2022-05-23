package com.org.tcs.sevice;

import com.org.tcs.model.Hero;
import com.org.tcs.repository.HeroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class HeroServiceImp implements HeroService {

@Autowired
    HeroRepo heroRepo;
    @Override
    public void createHero(Hero hero) {
        heroRepo.save(hero);

    }

    @Override
    public void updateHero(Hero hero) {
        heroRepo.save(hero);

    }

    @Override
    public Optional<Hero> getById(Integer id) {
        Optional<Hero> rr=heroRepo.findById(id);
        return rr;
    }

    @Override
    public String deleteById(Integer id) {
        heroRepo.deleteById(id);
        return "Success";
    }
}
