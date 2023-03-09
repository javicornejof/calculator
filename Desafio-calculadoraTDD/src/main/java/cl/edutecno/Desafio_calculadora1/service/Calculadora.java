package cl.edutecno.Desafio_calculadora1.service;

public class Calculadora {

	float valor1;
	float valor2;
	

//	3. Crear clase Calculadora, con los métodos “restar”, “sumar”, “multiplicar” y “dividir”	
//	Método restar
	public float Restar(float valor1, float valor2) {
		float restar = valor1 - valor2;
		return restar;
	}
	
//  Método sumar
	public float Sumar(float valor1, float valor2) {
		float sumar = valor1 + valor2;
		return sumar;
	}

//  Método multiplicar
	public float multiplicar(float valor1, float valor2) {
		float multiplicar = valor1 * valor2;
		return multiplicar;
	}

//  Método dividir
	public float dividir(float valor1, float valor2) {
		float dividir = valor1 / valor2;
		return dividir;
	}

	@Override
	public String toString() {
		return "Calculadora [valor1=" + valor1 + ", valor2=" + valor2 + "]";
	}

	public Calculadora(float valor1, float valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	
	
}
