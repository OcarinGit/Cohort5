package com.junitproject.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junitproject.modelo.OperacionesMatematicas;

class OperacionesMatematicasTest {

	@Test
	void testSumarNumeros() {
		OperacionesMatematicas objOperaciones = new OperacionesMatematicas();
		objOperaciones.setNumero1(2.0);
		objOperaciones.setNumero2(2.0);
		double resultadoReal=objOperaciones.sumarNumeros();
		double resultadoEsperado=4.0;
		assertEquals(resultadoEsperado,resultadoReal);
	}

}
