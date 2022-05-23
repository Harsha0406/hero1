package com.org.tcs.sevice;

import com.org.tcs.model.Hero;

import java.util.Optional;

public interface HeroService {
    public void createHero( Hero hero) ;
    public void updateHero( Hero hero) ;
    public Optional<Hero> getById(Integer id);
    public String deleteById( Integer id);
    }
