package cl.edutecno.Desafio_calculadora1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.edutecno.Desafio_calculadora1.repository.RepositorioCalculadora;




public class RepositorioCalculadoraTest {

	private static RepositorioCalculadora repositorioCalculadora = mock(RepositorioCalculadora.class);
	private static Logger logger = Logger.getLogger("cl.edutecno.Desafio_Calculadora");
	
	
	@BeforeAll
	static void setUp() {
		logger.info("Iniciando clase RepositorioPersonaTest\n");
	}
	
	void init() {
		logger.info("Iniciando test de prueba\n");
	}
	
	@Test
	@DisplayName("Test restar()")
	public void restar() {
		logger.info("Ejecutando test Restar");
		when(repositorioCalculadora.restar(9,7)).thenReturn(2.0f);
		float respuesta = repositorioCalculadora.restar(9,7);
		assertEquals(2.0f, respuesta);
		verify(repositorioCalculadora).restar(9,7);
	}
	
	@Test
	@DisplayName("Test sumar()")
	public void sumar() {
		logger.info("Ejecutando test Sumar");
		when(repositorioCalculadora.sumar(9,7)).thenReturn(16.0f);
		float respuesta = repositorioCalculadora.sumar(9,7);
		assertEquals(16.0f, respuesta);
		verify(repositorioCalculadora).sumar(9,7);
	}
	
	@Test
	@DisplayName("Test multiplicar()")
	public void multiplicar() {
		logger.info("Ejecutando test Multiplicar");
		when(repositorioCalculadora.multiplicar(9,7)).thenReturn(63.0f);
		float respuesta = repositorioCalculadora.multiplicar(9,7);
		assertEquals(63.0f, respuesta);
		verify(repositorioCalculadora).multiplicar(9,7);
	}
	
	@Test
	@DisplayName("Test dividir()")
	public void dividir() {
		logger.info("Ejecutando test Dividir");
		when(repositorioCalculadora.dividir(10,2)).thenReturn(5.0f);
		float respuesta = repositorioCalculadora.dividir(10,2);
		assertEquals(5.0f, respuesta);
		verify(repositorioCalculadora).dividir(10,2);
	}
	
}
