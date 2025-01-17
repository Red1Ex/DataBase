package com.example.db.controller;

import com.example.db.entity.PeopleEntity;
import com.example.db.repository.PeopleRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor

public class PeopleController {

    private final PeopleRepository peopleRepository;

    @PostMapping("/addPeople")
    public String newPeople(@RequestBody PeopleEntity people) {
        peopleRepository.save(people);
        return "New people added";
    }

    @GetMapping("/people/{id}")
    public Optional<PeopleEntity> getPeopleById(@PathVariable int id) {
        return peopleRepository.findById(id);
    }


    @GetMapping("/people")
    public List<PeopleEntity> getPeopleByGender(@RequestParam String g) {
        return peopleRepository.findAllByGender(g);
    }

    @DeleteMapping("people/{id}")
    public String deletePeople(@PathVariable int id) {
        PeopleEntity people = peopleRepository.findById(id).orElse(null);
        if (people == null) {
            return "такого человека нет";
        }
        peopleRepository.deleteById(id);
        return "ура человек удален";
    }

}

