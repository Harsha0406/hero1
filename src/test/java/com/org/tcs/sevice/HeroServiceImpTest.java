package com.org.tcs.sevice;

import com.org.tcs.model.Hero;
import com.org.tcs.repository.HeroRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class HeroServiceImpTest {
    @InjectMocks
    private HeroServiceImp heroServiceImp;
    @Mock
    private HeroRepo heroRepo;

    @Test
    void createHero() {
        Hero hero=new Hero();
        hero.setId(100);
        hero.setName("SaiKumar");
        hero.setSalary(500000.00);
        heroServiceImp.createHero(hero);
        Mockito.verify(heroRepo,Mockito.times(1)).save(hero);






    }

    @Test
    void updateHero() {
        Hero hero=new Hero();
        hero.setId(100);
        hero.setName("SaiKumar");
        hero.setSalary(50000.00);
        heroServiceImp.updateHero(hero);
        Mockito.verify(heroRepo,Mockito.times(1)).save(hero);
    }

    @Test
    void getById() {
        int id=100;
    Hero hero=new Hero();
        hero.setId(100);
        hero.setName("SaiKumar");
        hero.setSalary(50000.00);
        Optional<Hero> sky=Optional.of(hero);
        Mockito.when(heroRepo.findById(id)).thenReturn(sky);
        Optional<Hero> rajjj=heroServiceImp.getById(id);
        Assertions.assertEquals(sky,rajjj);
    }

    @Test
    void deleteById() {
        int id=100;
        String harsha="Success";
        String reddy=heroServiceImp.deleteById(id);
        Mockito.verify(heroRepo,Mockito.times(1)).deleteById(id);
        Assertions.assertEquals(reddy,harsha);

    }
}