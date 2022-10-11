package com.anamenezes.lemeviagensmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anamenezes.lemeviagensmongo.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends MongoRepository<ItemPedido, String> {

}
