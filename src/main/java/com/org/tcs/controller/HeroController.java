package com.org.tcs.controller;

import com.org.tcs.model.Hero;
import com.org.tcs.sevice.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")

public class HeroController {
@Autowired
    HeroService heroService;

    @PostMapping("/create")
    public void createHero(@RequestBody Hero hero) {
        heroService.createHero(hero);

    }

    @PutMapping("/update")
    public void updateHero(@RequestBody Hero hero) {
        heroService.updateHero(hero);

    }

    @GetMapping("/getById/{id}")
    public Optional<Hero> getById(@PathVariable Integer id){
        Optional<Hero> sai=heroService.getById(id);
        return sai;
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id) {
        String Raji=heroService.deleteById(id);
        return Raji;
    }
}