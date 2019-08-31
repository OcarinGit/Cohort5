package com.algoritmosentrevista.algoritmos;

public class Algoritmo3 {
	public int dameSiglo(int anio)
	{
		int siglo=0;
		
		if(anio%100==0)
		{
			siglo = (anio/100);
		}
		else
		{
			siglo = (anio/100)+1;
		}
		return siglo;
	}

}
