package com.jdbcproject.modelo;

public class Autores {
	private int idautor;
	private String nombre;
	private String apellido;
	private String domicilio;
	private double salario;
	
	public void setidautor(int autor)
	{
		idautor = autor;
	}
	
	public int getidautor()
	{
		return idautor;
	}
	
	public void setnombre(String nom)
	{
		nombre = nom;
	}
	
	public String getnombre()
	{
		return nombre;
	}
	
	public void setapellido(String apellido)
	{
		this.apellido = apellido;
	}
	
	public String getapellido()
	{
		return apellido;
	}
	
	public void setdomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}
	
	public String getdomicilio()
	{
		return domicilio;
	}
	
	public void setsalario(double salario)
	{
		this.salario = salario;
	}
	
	public double getsalario()
	{
		return salario;
	}
}
