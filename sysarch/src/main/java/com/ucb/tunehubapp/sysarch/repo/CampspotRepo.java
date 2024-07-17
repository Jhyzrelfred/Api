package com.ucb.tunehubapp.sysarch.repo;

import com.ucb.tunehubapp.sysarch.api.model.Campspot;
import com.ucb.tunehubapp.sysarch.api.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Optional;
@EnableMongoRepositories
public interface CampspotRepo extends MongoRepository<Campspot, String> {
//        Optional<Campspot> findByaCampNameAndfAccessibilities(String aCampName, String fAccessibilities);
        Optional<Campspot> findByaCampName(String aCampName);
    }

