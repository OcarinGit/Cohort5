package com.algoritmos.entrevista;

import java.util.Arrays;
import java.util.Random;

public class VectoresApp {

	public static void main(String[] args) {
		
		int[] vector1 = new int[3];
		int[] vector2 = new int[3];
		String num1="";
		String num2="";
		int diferencia=0;
		int movimientos=0;
		int resta=0;
		
		//int[] vector3 = new int[11];
		
		Random rnd = new Random(System.nanoTime());
		
		//Operacion de llenado
		for(int i=0; i<vector1.length;i++)
		{
			vector1[i]=rnd.nextInt(10000);
			vector2[i]=rnd.nextInt(10000);
		}
		
		//Operacion de mostrado
		System.out.println("Elementos del Vector 1");
		for(int i=0;i<vector1.length;i++)
		{
			System.out.println("["+i+"]:"+vector1[i]);
		}
		
		//Operacion de mostrado
		System.out.println("Elementos del Vector 2");
		for(int i=0;i<vector2.length;i++)
		{
			System.out.println("["+i+"]:"+vector2[i]);
		}
		
		//Proceso
		for(int i=0;i<vector1.length;i++)
		{
			movimientos=0;
			num1=String.valueOf((vector1[i]));
			num2=String.valueOf((vector2[i]));
			diferencia=Math.abs(num1.length()-num2.length());
			if(num1.length()>num2.length())
			{
				for(int j=0;j<diferencia;j++) 
				{
					//movimientos=movimientos+Integer.parseInt(String.valueOf(num1.charAt(j)));
					movimientos=movimientos+Character.getNumericValue(num1.charAt(j));
				}
				System.out.println("movimientos>:"+movimientos);
				for(int j=0;j<num2.length();j++)
				{
					//if(num1.length()<num2.length())
					resta=Math.abs(Character.getNumericValue(num1.charAt(j+diferencia))-Character.getNumericValue(num2.charAt(j)));
					movimientos=movimientos+resta;
				}
				System.out.println("movimientos>:"+movimientos);
			}
			else if(num2.length()>num1.length())
			{
				for(int j=0;j<diferencia;j++) 
				{
					movimientos=movimientos+Character.getNumericValue(num2.charAt(j));
				}
				for(int j=0;j<num1.length();j++)
				{
					//if(num1.length()<num2.length())
					resta=Math.abs(Character.getNumericValue(num1.charAt(j))-Character.getNumericValue(num2.charAt(j+diferencia)));
				}
				movimientos=movimientos+resta;
				System.out.println("movimientos<:"+movimientos);
			}
			else if( num2.length()==num1.length())
			{
				for(int j=0;j<num1.length();j++)
				{
					//if(num1.length()<num2.length())
					resta=Math.abs(Character.getNumericValue(num1.charAt(j))-Character.getNumericValue(num2.charAt(j)));
					movimientos=movimientos+resta;
				}
				
				System.out.println("movimientos0:"+movimientos);
			}
			
		}
			/*
			int resta=0;
			for(int j=diferencia;j<num1.length();j++)
			{
				if(num1.length()<num2.length())
				resta=Math.abs(num1.charAt(j+diferencia)-num2.charAt(j));
			}*/
			/*
			if(num2.length()-num1.length()>0)
			{
				
			}
			else
			{
				
			}*/
		//Operacion de Mostrar
		/*System.out.println("Elementos del Vector 1");
		for(int i=0;i<vector1.length;i++)
		{
			System.out.println("["+i+"]:"+vector1[i]);
		}
		System.out.println("La cantidad de movimientos fue:"+movimientos);*/
		
	}

}
