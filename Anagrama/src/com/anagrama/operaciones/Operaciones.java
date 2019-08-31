package com.anagrama.operaciones;

public class Operaciones {
	
	//Método para obtener factorial
	public int Factorial( int limite)
	{
		int factorial=1;
				
		if(limite>0)
		{
			for(int i=1;i<=limite;i++)
			{
				factorial = factorial*i;
			}
		}
		else if (limite==0)
		{
			factorial=1;
		}
		else
		{
			factorial=-1;
		}
		return factorial;
	}
}
