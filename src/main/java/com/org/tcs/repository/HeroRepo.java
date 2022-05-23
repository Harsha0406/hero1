package com.org.tcs.repository;

import com.org.tcs.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HeroRepo extends JpaRepository<Hero,Integer> {
}
