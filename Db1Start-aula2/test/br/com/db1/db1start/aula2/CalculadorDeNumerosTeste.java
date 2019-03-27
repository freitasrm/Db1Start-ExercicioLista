package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class CalculadorDeNumerosTeste {
	
	@Test
	public void deveRetornarQuantidadeDeNumerosImparesAte100() {
		CalculadorDeNumeros comparador = new CalculadorDeNumeros();
		int resultado = comparador.contarImparesAte100(97);
		Assert.assertEquals(2,resultado,0);
	}

	@Test
	public void deveDividirNumero1PorNumero2() {
		CalculadorDeNumeros comparador = new CalculadorDeNumeros();
		int resultado = comparador.dividir(8,2);
		Assert.assertEquals(4,resultado,0);
	}

	@Test
	public void deveMultiplicarNumero1PorNumero2() {
		CalculadorDeNumeros comparador = new CalculadorDeNumeros();
		int resultado = comparador.multiplicar(8,2);
		Assert.assertEquals(16,resultado,0);
	}

	@Test
	public void deveSomarNumero1PorNumero2() {
		CalculadorDeNumeros comparador = new CalculadorDeNumeros();
		int resultado = comparador.somar(8,2);
		Assert.assertEquals(10,resultado,0);
	}

	@Test
	public void deveSubtrairNumero1PorNumero2() {
		CalculadorDeNumeros comparador = new CalculadorDeNumeros();
		int resultado = comparador.subtrair(8,2);
		Assert.assertEquals(6,resultado,0);
	}
	
	@Test
	public void deveCalcularMediaDe3Numeros(){
		CalculadorDeNumeros calculo = new CalculadorDeNumeros();
		double resultado = calculo.calcularMedia(5, 3, 4);
		Assert.assertEquals(4, resultado, 0);
	}

	@Test
	public void deveCalcularAreaDeTriangulo(){
		CalculadorDeNumeros calculo = new CalculadorDeNumeros();
		double resultado = calculo.calcularAreaTriangulo(2,5);
		Assert.assertEquals(5, resultado, 0);
	}
}
