package com.anamenezes.lemeviagensmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anamenezes.lemeviagensmongo.domain.Pedido;
import com.anamenezes.lemeviagensmongo.repositories.PedidoRepository;
import com.anamenezes.lemeviagensmongo.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public List<Pedido> findAll(){
		return repo.findAll();
	}
	
	public Pedido findById(String id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}