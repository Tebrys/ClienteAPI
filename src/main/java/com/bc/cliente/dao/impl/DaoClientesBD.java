package com.bc.cliente.dao.impl;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bc.cliente.dao.IDaoCLiente;
import com.bc.cliente.entity.ClienteBD;

import lombok.extern.slf4j.Slf4j;

@Repository
@Transactional
@Slf4j
public class DaoClientesBD  implements IDaoCLiente{
@PersistenceContext
private EntityManager em ;
	@Override
	public List<ClienteBD> findAll() {
		
		
		try {
			@SuppressWarnings("unchecked")
			List<ClienteBD> listacliente = em.createQuery("from ClienteBD").getResultList();
			return listacliente;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public ClienteBD save(ClienteBD cliente) {
		try { em.persist(cliente);
			return cliente;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		
		}
		
		
	}

	@Override
	public ClienteBD update(ClienteBD cliente) {
		try { em.merge(cliente);
		return cliente;
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	
	}
		
	}

	@Override
	public ClienteBD findById(int idcliente) {
		ClienteBD datos = em.find(ClienteBD.class, idcliente);
		if (em == null)
		{
			throw new EntityNotFoundException("NO se encuentra el id buscado"+idcliente);
		}
				
		return datos;
	
	}
	
	
	
	
	
	

}
