package com.hibernateholamundo.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ChicxsApp {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.hibernateholamundo.app.Chicxs.class);
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session sesion = factory.openSession();
		Transaction transaccion = sesion.beginTransaction();
		
		Chicxs chi1= new Chicxs();
		chi1.setIdChicxs(2);
		chi1.setNombreChicxs("Chicxs");
		chi1.setApellidoChicxs("Chicxs");
		sesion.save(chi1);
		transaccion.commit();
		
		sesion.close();
		System.out.println("Registro guardado");
	}

}
