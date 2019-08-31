package org.holamundo.modelo;

public class SumarNumeros {
	
	private int numero1;
	private int numero2;
	
	public int Sumar(int num1, int num2)
	{
		return num1+num2;
	}
	
	public String Sumar()
	{
		return Integer.toString(numero1+numero2);
	}
	public int getNumero1()
	{
		return numero1;
	}
	
	public void setNumero1(int num)
	{
		numero1=num;
	}
	
	public int getNumero2()
	{
		return numero2;
	}
	
	public void setNumero2(int num)
	{
		numero2=num;
	}
}
