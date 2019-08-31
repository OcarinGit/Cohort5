package com.proyectoasincrono.modelo;

public class Numeros {
	private float numero1;
	private float numero2;
	
	public void setNumero1(float numero1)
	{
		this.numero1=numero1;
	}
	
	public float getNumero1()
	{
		return numero1;
	}
	
	public void setNumero2(float numero2)
	{
		this.numero2=numero2;
	}
	
	public float getNumero2()
	{
		return numero2;
	}
	
	public float sumaNumeros()
	{
		return numero1+numero2;
	}
}
