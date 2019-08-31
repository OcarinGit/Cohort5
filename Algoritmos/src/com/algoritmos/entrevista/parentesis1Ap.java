package com.algoritmos.entrevista;

import java.util.Scanner;

//Este algoritmo soluciona el problema de los par�ntesis
//Pedir una entrada al usuario y determinar si existe la misma cantidad de par�ntesis abriendo que cerrando.

public class parentesis1Ap {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		String cadena="";
		int contParentesis=0;
		boolean isNegativo=false;
		
		System.out.println("Dame un cadena que contenga par�ntesis abriendo y cerrando:");
		cadena=entrada.next();
		
		for(int i=0;i<cadena.length();i++)
		{
			//System.out.println("caracter:"+cadena.charAt(i));
			if(cadena.charAt(i)=='(')
			{
				contParentesis++;
			}
			else if(cadena.charAt(i)==')')
			{
				contParentesis--;
				if(contParentesis<0) isNegativo=true;
			}
		}
		
		if(contParentesis==0 && isNegativo==false)
			System.out.println("Cadena bien constru�da!!");
		else
			System.out.println("Cadena �O esta bien contru�da!!");
	}

}
