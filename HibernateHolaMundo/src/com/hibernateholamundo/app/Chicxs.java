package com.hibernateholamundo.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chicxs")
public class Chicxs {
	
	@Id
	@Column(name="idchicxs")
	private int idChicxs;
	
	@Column(name="nombrechicxs")
	private String nombreChicxs;
	
	@Column(name="apellidochicxs")
	private String apellidoChicxs;
	
	public int getIdChicxs() {
		return idChicxs;
	}
	public void setIdChicxs(int idChicxs) {
		this.idChicxs = idChicxs;
	}
	public String getNombreChicxs() {
		return nombreChicxs;
	}
	public void setNombreChicxs(String nombreChicxs) {
		this.nombreChicxs = nombreChicxs;
	}
	public String getApellidoChicxs() {
		return apellidoChicxs;
	}
	public void setApellidoChicxs(String apellidoChicxs) {
		this.apellidoChicxs = apellidoChicxs;
	}
	
	
}
