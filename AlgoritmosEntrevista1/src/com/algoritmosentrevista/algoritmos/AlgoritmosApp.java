package com.algoritmosentrevista.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class AlgoritmosApp {

	public static void main(String[] args) {
		
		//Algoritmo 1
		Algoritmo1 algo1 = new Algoritmo1();
		
		int[] numeros = new int[20];
		String cadena="";
		Random rand = new Random(System.nanoTime());
		
		for(int i=0;i<numeros.length;i++)
		{
			numeros[i]=rand.nextInt(100);
		}
		
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println(numeros[i]);
		}
		
		cadena=algo1.DosMasGrandes(numeros);
		System.out.println(cadena);
		
		
		//Algoritmo 2. Pedir un número entero al usuario y el programa debe regresar la suma de los números pares encontrados desde 0 hasta el número introducido por el usuario.
		Algoritmo2 algo2 = new Algoritmo2();
		Scanner entrada = new Scanner(System.in);
		int limite=0;
		
		System.out.println("Dame un número:");
		limite=entrada.nextInt();
		
		System.out.println("La suma es:"+algo2.SumarPares(limite));
		
		//Algoritmo 3. Dado un año obtener el siglo al que corresponde.
		/*Algoritmo3 algo3 = new Algoritmo3();
		int anio=1;
		do
		{
			System.out.println("Introduce un año (0 para salir):");
			try
			{
				if(entrada.hasNextInt())
				{
					anio=entrada.nextInt();
				}
				else
				{
					System.out.println("Ints only");
					System.out.println("Introduce un año (0 para salir):");
					anio=entrada.nextInt();
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Integers Only");
				anio=entrada.nextInt();
			}
		}while (anio!=0);
			System.out.println("El siglo correspondiente al año es:"+algo3.dameSiglo(anio));
		*/
			
			//Algoritmo 4. Pedir al usuario una cadena. Mostrar si la cadena tiene una cantidad de caracteres par o impar.
			
			System.out.println("Dame una cadena");
			String cad="";
			cad=entrada.nextLine();
			if(cad.length()%2==0) {
				System.out.println("Cadena Par");
			}
			else
			{
				System.out.println("Cadena Impar");
			}
		
			//Algoritmo 5. Crear un vector de n elementos y obtener el mayor.
			int[] vector = new int[10];
			Random aleatorios = new Random(System.nanoTime());
			for(int i=0;i<vector.length;i++)
			{
				vector[i]=aleatorios.nextInt(100);
			}
			for(int i=0;i<vector.length;i++)
			{
				System.out.println(vector[i]+" ");
			}
			int mayor=vector[0];
			for(int i=0;i<vector.length;i++)
			{
				if(vector[i]>mayor)
				{
					mayor=vector[i];
				}
			}
			System.out.println("El mayor es:"+mayor);
			
			//Algoritmo 6. Leer un archivo de texto. Posteriormente contar la cantidad de vocales y reemplazarlos por guión bajo. Mostrar el archivo leído, la cantidad de vocales y el archivo leído con las vocales reemplazadas por guiones bajos.
			
			try
			{
				File archivo = new File ("c:\\a\\testo.txt");
				FileReader reader = new FileReader(archivo);
				
				BufferedReader buffer = new BufferedReader(reader);
				String linea;
				
				FileWriter archivoBackup = new FileWriter("c:\\a\\testoBackup.txt");
				PrintWriter writer = new PrintWriter(archivoBackup);
				int contadorVocales=0;
				char[] CadenaNueva;
				while((linea=buffer.readLine())!=null)
				{
					CadenaNueva= linea.toCharArray();
					//System.out.println(linea);
					for(int i=0;i<linea.length();i++)
					{
						if(linea.charAt(i)=='a' || linea.charAt(i)=='A' || linea.charAt(i)=='e' || linea.charAt(i)=='E' ||linea.charAt(i)=='i' || linea.charAt(i)=='I' || linea.charAt(i)=='o' || linea.charAt(i)=='O' || linea.charAt(i)=='u' || linea.charAt(i)=='U')
						{
							contadorVocales++;
							CadenaNueva[i]='_';							
						}	
					}
					writer.println(CadenaNueva);
				}
				archivoBackup.close();
				writer.close();
				reader.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
	}
}
