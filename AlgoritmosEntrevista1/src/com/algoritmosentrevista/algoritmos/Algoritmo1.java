package com.algoritmosentrevista.algoritmos;

public class Algoritmo1 {
	
	public String[] cadena = {"hola","hoola1","hola2","hola3"};
	
	
	//Algoritmo de ejercicio de obtener los dos números más grandes de una serie de números y concatenarlos en una cadena
	public String DosMasGrandes(int[] numeros)
	{
		if (cadena[0].isEmpty())
		{
			System.out.println("Arreglo vacío");
		}
		else
		{
			System.out.println("Arreglo no vacío");
		}
		String cadResultante="";
		
		int temp=0;
		for(int i=0; i<numeros.length;i++)
		{
			for(int j=0;j<numeros.length-1;j++)
			{
				if (numeros[j]>numeros[j+1])
				{
					temp=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=temp;
				}
			}
		}
		
		/*
		for(int i=0;i<numeros.length;i++)
		{
			cadResultante+=numeros[i]+" ";
		}
		*/
		cadResultante = String.valueOf(numeros[numeros.length-1])+String.valueOf(numeros[numeros.length-2]);
		
		cadResultante = ""+numeros[numeros.length-1]+numeros[numeros.length-2];
		return cadResultante;
	}

}
