package com.thiagorogerio.cursomc.domain;

import javax.persistence.Entity;

import com.thiagorogerio.cursomc.domain.enums.EstadoPagamento;

/**
 * 
 * @author trcustodio
 *
 */

@Entity
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = -5686431357729379912L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estadoPagamento, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	
}
