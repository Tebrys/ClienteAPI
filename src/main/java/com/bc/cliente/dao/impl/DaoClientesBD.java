package com.bc.cliente.dao.impl;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bc.cliente.dao.IDaoCLiente;
import com.bc.cliente.entity.AlumnosBD;

import lombok.extern.slf4j.Slf4j;

@Repository
@Transactional
@Slf4j
public class DaoClientesBD  implements IDaoCLiente{
@PersistenceContext
private EntityManager em ;
	@Override
	public List<AlumnosBD> findAll() {
		
		
		try {
			@SuppressWarnings("unchecked")
			List<AlumnosBD> listaAlumnos = em.createQuery("from AlumnosBD").getResultList();
			return listaAlumnos;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public AlumnosBD save(AlumnosBD alumno) {
		try { em.persist(alumno);
			return alumno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		
		}
		
		
	}

	@Override
	public AlumnosBD update(AlumnosBD alumno) {
		try { em.merge(alumno);
		return alumno;
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	
	}
		
	}

	@Override
	public AlumnosBD findById(int id_alumno) {
		AlumnosBD datos = em.find(AlumnosBD.class, id_alumno);
		if (em == null)
		{
			throw new EntityNotFoundException("NO se encuentra el id buscado"+id_alumno);
		}
				
		return datos;
	
	}
	
	
	
	
	
	

}
