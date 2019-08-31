package com.algoritmos.entrevista;

import java.util.Scanner;

//Este algoritmo soluciona el problema de los paréntesis
//Pedir una entrada al usuario y determinar si existe la misma cantidad de paréntesis abriendo que cerrando.

public class parentesis1Ap {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		String cadena="";
		int contParentesis=0;
		boolean isNegativo=false;
		
		System.out.println("Dame un cadena que contenga paréntesis abriendo y cerrando:");
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
			System.out.println("Cadena bien construída!!");
		else
			System.out.println("Cadena ÑO esta bien contruída!!");
	}

}
