package com.bc.cliente.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bc.cliente.dao.IDaoCLiente;
import com.bc.cliente.entity.*;
import com.google.gson.Gson;

import java.util.List;
@RestController
@RequestMapping(value = "/api")
public class indexController {
	@Autowired
	private IDaoCLiente dato;
	
	
	@GetMapping(value = "/getClientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAlumnos() {
		List<AlumnosBD> lista = dato.findAll();
		
		Gson gson = new Gson();
		return gson.toJson(lista);
	}
	@PostMapping(value ="/clientes", consumes  = MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseBody
		public AlumnosBD INSERTAR (@RequestBody AlumnosBD alumno)  {
			
			
		return dato.save(alumno);
		}
	
	
	
	@PutMapping (value = "/putAlumnos/{id_alumno}", consumes = MediaType.APPLICATION_JSON_VALUE, produces  = MediaType.APPLICATION_JSON_VALUE)
	public AlumnosBD update(@PathVariable int id_alumno, @RequestBody AlumnosBD alumno) {
	    AlumnosBD alumnoToUpdate = dato.findById(id_alumno);
	    if (alumnoToUpdate != null) {
	        alumnoToUpdate.setPrimernombre(alumno.getPrimernombre());
	        alumnoToUpdate.setSegundonombre(alumno.getSegundonombre());
	        alumnoToUpdate.setSegundoapellido(alumno.getSegundoapellido());
	        alumnoToUpdate.setSueldo(alumno.getSueldo());
	        alumnoToUpdate.setCorreo(alumno.getCorreo());
	        alumnoToUpdate.setSegmento(alumno.getSegmento());
	       
	        
	        return dato.update(alumnoToUpdate);
	   
		
	    }else {
		return null;
	    }
	    }
}

	
	
	
	
