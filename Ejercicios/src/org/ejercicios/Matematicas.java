package org.ejercicios;

public class Matematicas {
	
	public boolean Primo(int numero)
	{
		//boolean isPrimo=false;
		for(int cont=2;cont<numero;cont++)
		{
			if(numero%cont==0)
				return false;
		}
		
		return true;
	}
	
	public int[] Primos(int numero)
	{
		boolean isPrimo=true;
		
		int[] numeros_primos=new int[100];
		int x=0;
		int numero_primo=0;
		for(int cont=2;cont<numero;cont++)
		{
			isPrimo=true;
			for(int cont2=2;cont2<cont;cont2++)
			{
				if(cont%cont2==0)
				{
					isPrimo=false;
					numero_primo=cont2;
					break;
				}
			}
			if(isPrimo==true)
			{
				numeros_primos[x]=cont;
				x++;
			}
		}
		
		return numeros_primos;
	}
	
	public long[] fibonacci(int limite)
	{
		long[] serieF= new long[limite];

		serieF[0]=0;
		serieF[1]=1;
		
		for(int cont=2;cont<limite;cont++)
		{
			serieF[cont]=serieF[cont-2]+serieF[cont-1];
		}
		
		return serieF;
	}
	
	
}
