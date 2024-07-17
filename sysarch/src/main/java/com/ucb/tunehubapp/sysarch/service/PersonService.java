package com.ucb.tunehubapp.sysarch.service;

import com.ucb.tunehubapp.sysarch.api.model.Person;
import com.ucb.tunehubapp.sysarch.dto.PersonDTO;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> getAllUsers();

    String addPerson(PersonDTO personDTO);
    Optional<Person> getPerson(String name, String email, String password);
    boolean personExists(String email);

}