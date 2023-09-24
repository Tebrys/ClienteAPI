package com.bc.cliente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Table(name = "clientes")
@Entity
@Data
public class AlumnosBD {
	
	@Id 
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column (name = "idcliente")
	private int idcliente;
	@Column (name = "primernombre")
	private String primernombre;
	@Column (name = "segundonombre")
	private String segundonombre;
	@Column (name = "otronombre")
	private String otronombre;
	@Column (name = "segundoaepllido")
	private String segundoaepllido;
	@Column (name = "otroapellido")
	private String otroapellido;
	@Column (name = "genero")
	private String genero;
	@Column (name = "fechanace")
	private String fechanace;
	@Column (name = "segmento")
	private String segmento;
	@Column (name = "sueldo")
	private int sueldo;
	@Column (name = "dpi")
	private String dpi;
	@Column (name = "correo")
	private String correo;
	@Column (name = "telefono")
	private int telefono;
	@Column (name = "direccion")
	private String direccion;
	@Column (name = "fechacreacion")
	private String fechacreacion;
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getPrimernombre() {
		return primernombre;
	}
	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}
	public String getSegundonombre() {
		return segundonombre;
	}
	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}
	public String getOtronombre() {
		return otronombre;
	}
	public void setOtronombre(String otronombre) {
		this.otronombre = otronombre;
	}
	public String getSegundoaepllido() {
		return segundoaepllido;
	}
	public void setSegundoaepllido(String segundoaepllido) {
		this.segundoaepllido = segundoaepllido;
	}
	public String getOtroapellido() {
		return otroapellido;
	}
	public void setOtroapellido(String otroapellido) {
		this.otroapellido = otroapellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFechanace() {
		return fechanace;
	}
	public void setFechanace(String fechanace) {
		this.fechanace = fechanace;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public String getDpi() {
		return dpi;
	}
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	
	
	
}
