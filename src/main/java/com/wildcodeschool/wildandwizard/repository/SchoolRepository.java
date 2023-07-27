package com.wildcodeschool.wildandwizard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.wildandwizard.entity.School;
import com.wildcodeschool.wildandwizard.entity.Wizard;

// TODO : update this interface
@Repository
public interface SchoolRepository extends JpaRepository<Wizard, Long>{

  void save(School school);
}

