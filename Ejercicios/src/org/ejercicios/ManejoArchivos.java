package org.ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {
	
	public String leerArchivo(String nombreArchivo)
	{
		String cadena="";
		String temp="";
		FileReader reader;
		BufferedReader bf;
		try
		{
			reader = new FileReader(nombreArchivo);
			
			bf = new BufferedReader(reader);
			
			while((temp=bf.readLine())!=null)
			{
				//System.out.println(cadena);
				cadena=cadena+temp+"\n";
			}
			bf.close();
			reader.close();
		}
		catch(FileNotFoundException ex)
		{
			//System.out.println("No se encontró el archivo "+nombreArchivo);
			cadena="No se encontró el archivo"+nombreArchivo;
		}
		catch(IOException e)
		{
			//System.out.println("El archivo no pudo ser cerrado!");
			cadena= "El archivo no pudo ser cerrado!\n"+ e.getMessage();
			//e.printStackTrace();
		}
		return cadena;
	}
	public void escribirArchivo(String nombreArchivo, String contenido)
	{
		FileWriter archivo;
		PrintWriter writer;
		try
		{
			archivo = new FileWriter(nombreArchivo,true);
			writer = new PrintWriter(archivo);
			//writer.println(contenido);
			for(int cont=200;cont<=300;cont++)
			{
				System.out.println(cont);
				writer.println(cont);
			}
			archivo.close();
			writer.close();
		}
		catch(IOException perro)
		{
			perro.printStackTrace();
		}
	}
}
