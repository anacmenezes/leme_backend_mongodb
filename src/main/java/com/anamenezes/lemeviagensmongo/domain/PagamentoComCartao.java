package com.anamenezes.lemeviagensmongo.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import com.anamenezes.lemeviagensmongo.domain.enums.EstadoPagamento;

@Document
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
	}

	public PagamentoComCartao(String id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
}