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

import javax.persistence.Embeddable;
@RestController
@RequestMapping(value = "/api")
public class indexController {
	@Autowired
	private IDaoCLiente dato;
	
	
	@GetMapping(value = "/getClientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getcliente() {
		List<ClienteBD> lista = dato.findAll();
		
		Gson gson = new Gson();
		return gson.toJson(lista);
	}
	
	@GetMapping(value = "/getClientes/{idcliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ClienteBD getCliente(@PathVariable int idcliente) {
	
			
		return dato.findById(idcliente);
	}

	
	@PostMapping(value ="/clientes", consumes  = MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseBody
		public ClienteBD INSERTAR (@RequestBody ClienteBD cliente)  {
			
			
		return dato.save(cliente);
		}
	
	
	
	@PutMapping (value = "/putCliente/{idcliente}", consumes = MediaType.APPLICATION_JSON_VALUE, produces  = MediaType.APPLICATION_JSON_VALUE)
	public ClienteBD update(@PathVariable int idcliente, @RequestBody ClienteBD cliente) {
	    ClienteBD clienteToUpdate = dato.findById(idcliente);
	    if (clienteToUpdate != null) {
	    	clienteToUpdate.setPrimernombre(cliente.getPrimernombre());
	    	clienteToUpdate.setSegundonombre(cliente.getSegundonombre());
	    	clienteToUpdate.setOtronombre(cliente.getOtronombre());
	    	clienteToUpdate.setPrimerapellido(cliente.getPrimerapellido());
	    	clienteToUpdate.setSegundoaepllido(cliente.getSegundoaepllido());
	    	clienteToUpdate.setOtroapellido(cliente.getOtroapellido());
	    	clienteToUpdate.setGenero(cliente.getGenero());
	    	clienteToUpdate.setFechanace(cliente.getFechanace());
	    	clienteToUpdate.setSegmento(cliente.getSegmento());
	    	clienteToUpdate.setSueldo(cliente.getSueldo());
	    	clienteToUpdate.setDpi(cliente.getDpi());
	    	clienteToUpdate.setCorreo(cliente.getCorreo());
	    	clienteToUpdate.setTelefono(cliente.getTelefono());
	    	clienteToUpdate.setDireccion(cliente.getDireccion());	        
	        return dato.update(clienteToUpdate);
	   
		
	    }else {
		return null;
	    }
	    }
}

	
	
	
	
