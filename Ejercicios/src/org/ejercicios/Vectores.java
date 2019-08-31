package org.ejercicios;

import java.util.Random;

public class Vectores {
	
	public String Serie1_100()
	{
		String resultado="";
		
		for(int cont=1;cont<=100;cont++)
		{
			resultado=resultado+cont+" ";
		}
		return resultado;
	}
	
	public int[] Serie1_100v()
	{
		int[] v=new int[100];
		
		for(int cont=0;cont<100;cont++)
		{
			v[cont]=cont+1;
		}
		return v;
	}
	
	public boolean Par(int numero)
	{
		boolean isPar=false;
		if(numero%2==0)
			isPar=true;
		else
			isPar=false;
		return isPar;
	}
	
	public boolean Impar(int numero)
	{
		boolean isImpar=false;
		if(numero%2!=0)
			isImpar=true;
		else
			isImpar=false;
		return isImpar;
	}
	
	public int suma_vector(int[] vector)
	{
		int suma=0;
		for(int cont=0;cont<vector.length;cont++)
		{
			suma=suma+vector[cont];
		}
		return suma;
	}
	
	public String[] Numeros2Meses(int[] numeros)
	{
		String[] meses = new String[numeros.length];
		
		for(int cont=0;cont<numeros.length;cont++)
		{
			switch(numeros[cont])
			{
			case 1: meses[cont]="Enero";
			break;
			case 2: meses[cont]="Febrero";
			break;
			case 3: meses[cont]="Marzo";
			break;
			case 4: meses[cont]="Abril";
			break;
			case 5: meses[cont]="Mayo";
			break;
			case 6: meses[cont]="Junio";
			break;
			case 7: meses[cont]="Julio";
			break;
			case 8: meses[cont]="Agosto";
			break;
			case 9: meses[cont]="Septiembre";
			break;
			case 10: meses[cont]="Octubre";
			break;
			case 11: meses[cont]="Noviembre";
			break;
			case 12: meses[cont]="Diciembre";
			break;
			default: meses[cont]="NA";
			break;
			}
		}
		return meses;
	}
	
	public int[] AleatoriosVector(int cantidad)
	{
		int[] aleatorios= new int[cantidad];
		Random rnd = new Random(System.nanoTime());
		int numeroAleatorioGenerado=0;
		int cont=0;
		while(cont<cantidad)
		{
			aleatorios[cont]=numeroAleatorioGenerado=rnd.nextInt(100);
			cont++;
		}
		return aleatorios;
	}
	
	public int[] sumaTresVectores(int[] vec1, int[] vec2, int[] vec3)
	{
		int[] vecSuma= new int[vec1.length];
		int cont=0;
		while (cont <vecSuma.length)
		{
			vecSuma[cont]=vec1[cont]+vec2[cont]+vec3[cont];
			cont++;
		}
		return vecSuma;
	}
}
