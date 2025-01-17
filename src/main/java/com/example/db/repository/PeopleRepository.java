package com.example.db.repository;

import com.example.db.entity.PeopleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepository extends JpaRepository<PeopleEntity, Integer> {
    List <PeopleEntity> findAllByGender(String name);
}
