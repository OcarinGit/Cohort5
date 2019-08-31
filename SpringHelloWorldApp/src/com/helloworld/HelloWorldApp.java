package com.helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldApp {

	public static void main(String[] args) {
		
		//Dejando que el programador cree los objetos. La forma tradicional.
		HelloWorld msgBienvenida = new HelloWorld();
		
		msgBienvenida.setMensaje("Hola Mundo");
		System.out.println(msgBienvenida.getMensaje());
		
		//Creando los objetos mediante el Spring Container. IoC (Inversion of Control) way.
		Resource resource = new ClassPathResource("helloworldbean.xml");
		
		//Spring container which shall parse XML File and Construct the objects
		BeanFactory factory = new XmlBeanFactory(resource);
		
		HelloWorld h1 = (HelloWorld) factory.getBean("hello1");
		HelloWorld h2 = factory.getBean("hello2", HelloWorld.class);
		System.out.println("Hola Mundo 1:"+h1.getMensaje());
		System.out.println("Hola Mundo 2:"+h2.getMensaje());
	}

}
