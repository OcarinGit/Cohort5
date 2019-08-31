package com.junitproject.modelo;

public class OperacionesMatematicas {
	private double numero1;
	private double numero2;
	
	public double getNumero1()
	{
		return numero1;
	}
	
	public void setNumero1(double num1)
	{
		numero1=num1;
	}
	
	public double getNumero2()
	{
		return numero2;
	}
	
	public void setNumero2(double num2)
	{
		numero2=num2;
	}
	
	public double sumarNumeros()
	{
		return numero1+numero2;
	}
}
