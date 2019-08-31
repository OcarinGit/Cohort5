package com.hibernateholamundo.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HolaMundoApp {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(com.hibernateholamundo.app.Chicxs.class);
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session sesion  = factory.openSession();
		
		Transaction transa = sesion.beginTransaction();
		
		//Inicia la manipulación de los objetos
		Chicxs chi1 = new Chicxs();
		chi1.setIdChicxs(1);
		chi1.setNombreChicxs("Cesar");
		chi1.setApellidoChicxs("Gonzalez");
		//Finaliza la manipulación de los objetos
		
		sesion.save(chi1);
		transa.commit();
		sesion.close();
		System.out.println("Registro Guardado Exitosamente");
		
	}

}
