package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ContadorDeTextosTeste {

	@Test
	public void deveContarCaracteres(){
		ContadorDeTextos comparador = new ContadorDeTextos();
		Integer resultado = comparador.contarCaracteres("DB1START");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(8,resultado,0);
	}

	@Test
	public void deveContarVogais(){
		ContadorDeTextos comparador = new ContadorDeTextos();
		Integer resultado = comparador.contarVogais("DB1START");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(1,resultado,0);
	}

	@Test
	public void deveContarCaracteresSemEspaco(){
		ContadorDeTextos comparador = new ContadorDeTextos();
		int resultado = comparador.contarCaracteresSemEspaco(" DB1START ");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals(8,resultado,0);
	}


}
