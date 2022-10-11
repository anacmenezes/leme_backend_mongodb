package com.anamenezes.lemeviagensmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagensmongo.domain.Pedido;

@Repository
public interface PedidoRepository extends MongoRepository<Pedido, String> {

}
