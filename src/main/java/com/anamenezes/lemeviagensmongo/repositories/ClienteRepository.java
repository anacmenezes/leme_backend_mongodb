package com.anamenezes.lemeviagensmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagensmongo.domain.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
