package com.anamenezes.lemeviagensmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagensmongo.domain.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String> {

}
