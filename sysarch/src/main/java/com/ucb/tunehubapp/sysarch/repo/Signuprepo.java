package com.ucb.tunehubapp.sysarch.repo;

import com.ucb.tunehubapp.sysarch.api.model.Campspot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Optional;

@EnableMongoRepositories
public interface Signuprepo extends MongoRepository<Campspot, String> {
}