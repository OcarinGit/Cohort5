package com.algoritmosentrevista.algoritmos;

public class Algoritmo2 {

	public int SumarPares(int limite)
	{
		int suma=0;
		for(int cont=0;cont<=limite;cont=cont+2)
		{
			suma=suma+cont;
		}
		return suma;
	}
}
