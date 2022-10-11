package com.anamenezes.lemeviagensmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anamenezes.lemeviagensmongo.domain.Pedido;
import com.anamenezes.lemeviagensmongo.services.PedidoService;

@RestController
@RequestMapping(value = "/users")
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@RequestMapping(method=RequestMethod.GET)
 	public ResponseEntity<List<Pedido>> findAll() {
		List<Pedido> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
 	public ResponseEntity<Pedido> findById(@PathVariable String id) {
		Pedido obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}