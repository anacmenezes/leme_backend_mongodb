package com.anamenezes.lemeviagensmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagensmongo.domain.RegiaoDestino;

@Repository
public interface RegiaoDestinoRepository extends MongoRepository<RegiaoDestino, String> {

}
