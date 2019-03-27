package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ComparadorDeNumerosTeste {
	
	@Test
	public void deveRetornarNumero1MenorQueNumero2(){
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.menor(1,2);
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(1, resultado, 0);
	}
	
	@Test
	public void deveRetornarNumero2MenorQueNumero1(){
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.menor(30,20);
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(20, resultado, 0);
		// intelij/sonar boas praticas de 85% de codigo testado
	}

	@Test
	public void deveRetornarNumero1MenorQueNumero2MenorQueNumero3(){
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.menor(1,2,3);
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(1, resultado, 0);
	}

	@Test
	public void deveRetornarNumero2MenorQueNumero1MenorQueNumero3(){
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.menor(5,1,3);
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(1, resultado, 0);
	}

	
	@Test
	public void deveRetornarNumero3MenorQueNumero1MenorQueNumero2(){
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.menor(5,3,1);
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(1, resultado, 0);
	}

	@Test
	public void deveRetornarNumeroPar(){
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		boolean resultado = comparador.par(1);
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(false, resultado);
	}

	@Test
	public void deveRetornarNumeroImpar(){
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		boolean resultado = comparador.par(2);
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(true, resultado);
	}

	@Test
	public void deveRetornarInteiro1MaiorQueNumero2(){
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		int resultado = comparador.maior(2,1);
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(2, resultado,0);
	}

	@Test
	public void deveRetornarInteiro2MaiorQueNumero1(){
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		int resultado = comparador.maior(1,2);
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(2, resultado,0);
	}

	
	
	
	
}
