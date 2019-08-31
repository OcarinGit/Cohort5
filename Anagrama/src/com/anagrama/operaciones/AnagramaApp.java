package com.anagrama.operaciones;

import java.util.Scanner;

public class AnagramaApp {

	public static void main(String[] args) {
		Operaciones objOperaciones= new Operaciones();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena:");
		String cadena=entrada.next();
		int longitudCadena=cadena.length();
		int combinaciones= objOperaciones.Factorial(longitudCadena);
		int combinacionesRestantes=0; //El factorial de cada vuelta restante
		int noCaracter=0; //Guarda en que caracter va el ciclo
		String[] cadenas = new String[combinaciones];
		
		System.out.println("Cantidad de combinaciones:"+combinaciones);
		
		for(int i=0;i<longitudCadena;i++)
		{
			noCaracter=i+1;
			
			int cantidadCiclos=combinaciones/(longitudCadena);
			int cantidadCiclos2=objOperaciones.Factorial(longitudCadena-noCaracter);
			//Es i+1 por que la letra actual del ciclo no se toma en cuenta.
			
			for(int j=0;j<cantidadCiclos2;j++)
			{
				//combinacionesRestantes=objOperaciones.Factorial(longitudCadena-j);
			}
			
		}
	}

}
