package com.thiagorogerio.cursomc.services;

/**
 * @author trogerio
 */

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagorogerio.cursomc.domain.Pedido;
import com.thiagorogerio.cursomc.exceptions.ObjectNotFoundException;
import com.thiagorogerio.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> objeto = pedidoRepository.findById(id);
		return objeto.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: "+id
				+", Tipo: "+ Pedido.class.getName()));
	}
}
