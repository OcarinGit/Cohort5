package org.ejercicios;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppEjercicios {

	public static void main(String[] args) 
	{
		Scanner entrada= new Scanner(System.in);
		int numero=0;
		
		/*
		int[] v = new int[100];
		Vectores algoritmos = new Vectores();
		
		v=algoritmos.Serie1_100v();
		for(int cont=0;cont<100;cont++)
		{
			System.out.println(v[cont]);
		}
		System.out.print("La suma de los elementos es:");
		System.out.println(algoritmos.suma_vector(v));
		System.out.println("Dame un número:");
		numero=entrada.nextInt();
		System.out.println("El numero es Impar?"+
		algoritmos.Impar(numero));
		System.out.println("Cuantos meses deseas convertir?");
		numero=entrada.nextInt();
		int[] n = new int[numero];

		for(int cont=0;cont<numero;cont++)
		{
			System.out.println("Introduce un número de mes:");
			n[cont]=entrada.nextInt();
		}
		for(int cont=0;cont<n.length;cont++)
		{
			System.out.println(n[cont]);
		}
		String[] m = new String[n.length];
		
		m=algoritmos.Numeros2Meses(n);
		
		for(int cont=0;cont<m.length;cont++)
		{
			System.out.println(m[cont]);
		}
		
		//Ejercicio de los números primos
		Matematicas mates = new Matematicas();
		System.out.println("Introduce un numero:");
		numero = entrada.nextInt();
		System.out.println("El número es primo:"+mates.Primo(numero));
		
		//System.out.println("Los primos palindromos son:"+ mates.Primos(numero));
		n=mates.Primos(numero);
		for (int cont=0;cont<numero;cont++)
		{
			System.out.println(n[cont]);
		}
		*/
		
		/*Ejercicio con cadenas
		ManejoCadenas objCadenas= new ManejoCadenas();
		String cadena="";
		
		System.out.println("Introduce una cadena:");
		cadena=entrada.nextLine();
		System.out.println("La cadena es palindroma?"+objCadenas.Palindromo(cadena));
		
		System.out.println("Introduce el limite de la serie de Fibonacci:");
		
		int limite=0;
		
		limite=entrada.nextInt();
		long[] serieF= new long[limite];
		Matematicas mates= new Matematicas();
		serieF = mates.fibonacci(limite);
		for (int cont=0;cont<limite;cont++)
		{
			System.out.println(serieF[cont]);
		}
		*/
		
		/*Operaciones con números aleatorios
		Vectores vec= new Vectores();
		System.out.println("Cuantos aleatorios deseas generar?");
		numero=entrada.nextInt();
		int[] nAleatorios=new int[numero];
		nAleatorios=vec.AleatoriosVector(numero);
		for(int cont=0;cont<numero;cont++)
		{
			System.out.println("Aleatorio No "+cont+":"+nAleatorios[cont]);
		}*/
		/*Ejercicio de ciclos
		int numero1=0;
		int numero2=0;
		char respuesta='s';
		do
		{
			System.out.println("Dame un numero:");
			numero1 = entrada.nextInt();
			System.out.println("Dame un numero:");
			numero2 = entrada.nextInt();
			System.out.println("Suma:" + (numero1 + numero2));
			
			System.out.println("Otra vuelta?(S=Si, N=No)");
			respuesta=entrada.next().charAt(0);
		}while(respuesta=='s' || respuesta=='S');
		}*/
		
		/*Ejercicio de suma de vectores
		//limiteElementos es una variable que guarda la cantidad de elementos a procesar en los vectores
		int limiteElementos=20;
		Vectores objVectores= new Vectores();
		int[] vector1=new int[limiteElementos];
		vector1=objVectores.AleatoriosVector(limiteElementos);
		int[] vector2=new int[limiteElementos];
		vector2=objVectores.AleatoriosVector(limiteElementos);
		int[] vector3=new int[limiteElementos];
		vector3=objVectores.AleatoriosVector(limiteElementos);
		int[] vectorSuma= new int[limiteElementos];
		
		vectorSuma=objVectores.sumaTresVectores(vector1, vector2, vector3);
		
		for(int cont=0;cont<vectorSuma.length;cont++)
		{
			System.out.println("Vector 1:"+vector1[cont]+"+ Vector2:"+vector2[cont]+"+ Vector 3:"+vector3[cont]+"="+ vectorSuma[cont]);
		}
		*/
		
		/*Ejercicios de Entrada/Salida*/
		/*String contenidoArchivo="";
		ManejoArchivos archivos = new ManejoArchivos();
		contenidoArchivo=archivos.leerArchivo("c:\\a\\testo.txt");
		System.out.println(contenidoArchivo);
		System.out.println(archivos.leerArchivo("c:\\a\\testo.txt"));
		
		archivos.escribirArchivo("c:\\a\\testo3.txt", "Este es un testo");
		*/
		tablaMultiplicar();
		entrada.close();
	}
	
	public static void tablaMultiplicar()
	{
		FileWriter archivo;
		PrintWriter writer;
		try
		{
			archivo = new FileWriter("e:\\a\\tablaMultiplicar.txt",true);
			writer = new PrintWriter(archivo);
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Que tabla de multiplicar deseas mostrar?");
			int numero=entrada.nextInt();
			String temp="";
			for(int cont=1;cont<=20;cont++)
			{
				System.out.println(numero+" X "+cont+ " = "+numero*cont);
				temp = temp+numero+" X "+cont+ " = "+numero*cont;
				temp=temp+"\r\n";
				
				//writer.print("\n");
			}
			writer.print(temp);
			
			entrada.close();
			archivo.close();
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println("Error de entrada/salida");
		}
		
	}
}
