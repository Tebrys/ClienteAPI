package com.bc.cliente.dao;
import java.util.List;

import com.bc.cliente.entity.*;
public interface IDaoCLiente {

	
		public List<ClienteBD> findAll();
		public ClienteBD save(ClienteBD cliente);
		public ClienteBD update (ClienteBD cliente);
		public ClienteBD findById(int idcliente);
		
	

}
