package com.anamenezes.lemeviagensmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagensmongo.domain.CidadeDestino;

@Repository
public interface CidadeDestinoRepository extends MongoRepository<CidadeDestino, String> {

}
