package cl.edutecno.Desafio_calculadora1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.edutecno.Desafio_calculadora1.service.Calculadora;

public class CalculadoraTest {


	Calculadora calculadora = new Calculadora(0, 0);
	private static Logger logger = Logger.getLogger("cl.edutecno.Desafio.calculadora1");

	@BeforeAll
	static void setUp() {
		logger.info("Iniciando pruebas unitarias en la clase Calculadora\n");
	}

	@BeforeEach
	void init() {
		logger.info("Iniciando test de prueba");

	}

	@AfterEach
	void tearDown() {
		logger.info("Terminando método de prueba\n");
	}

	@AfterAll
	static void done() {
		logger.info("Fin de la clase Calculadora");
	}

	@Test
	@DisplayName("Test sumar()")
	public void sumar() {

		logger.info("Iniciando test unitario sumar");
//		Calculadora calculadora = new Calculadora(10f, 5f);
		float respuesta = calculadora.Sumar(10f, 5f);
		assertEquals(respuesta, 15f);
	}

	@Test
	@DisplayName("Test restar()")
	public void restar() {

		logger.info("Iniciando test unitario restar");
//		Calculadora calculadora = new Calculadora(10f, 5f);
		float respuesta = calculadora.Restar(10f, 5f);
		assertEquals(respuesta, 5f);
	}

	@Test
	@DisplayName("Test multiplicar()")
	public void multiplicar() {

		logger.info("Iniciando test unitario multiplicar");
//		Calculadora calculadora = new Calculadora(10f, 5f);
		float respuesta = calculadora.multiplicar(10f, 5f);
		assertEquals(respuesta, 50f);
	}

	@Test
	@DisplayName("Test dividir()")
	public void dividir() {

		logger.info("Iniciando test unitario dividir");
//		Calculadora calculadora = new Calculadora(10f, 2f);
		float respuesta = calculadora.dividir(10f, 2f);
		assertEquals(respuesta, 5f);
	}

}
