package com.bc.cliente.dao;
import java.util.List;

import com.bc.cliente.entity.*;
public interface IDaoCLiente {

	
		public List<AlumnosBD> findAll();
		public AlumnosBD save(AlumnosBD alumno);
		public AlumnosBD update (AlumnosBD alumno);
		public AlumnosBD findById(int idalumno);
		
	

}
