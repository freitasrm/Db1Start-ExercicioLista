package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class MascaradorDeTextosTeste {
	
	@Test
	public void deveSubstituirPrimeiroNomePorAluno(){
		MascaradorDeTextos comparador = new MascaradorDeTextos();
		String resultado = comparador.substituiPrimeiroNomePorAluno("Primeiro Nome");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals("Aluno Nome",resultado);
	}

	@Test
	public void deveExibir4PrimeirosCaracteres(){
		MascaradorDeTextos comparador = new MascaradorDeTextos();
		String resultado = comparador.mostra4PrimeirosCaracteres("Rodrigo Martins");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals("Rodr",resultado);
	}

	@Test
	public void deveExibir4UltimosCaracteres(){
		MascaradorDeTextos comparador = new MascaradorDeTextos();
		String resultado = comparador.mostra4UltimosCaracteres("Rodrigo Martins");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals("tins",resultado);
		
	}

	@Test
	public void deveExibirAPartirDo3Caracter(){
		MascaradorDeTextos comparador = new MascaradorDeTextos();
		String resultado = comparador.mostraAPartir3Caracter("Rodrigo Martins");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals("drigo Martins",resultado);
		//System.out.println(resultado);
	}

	@Test
	public void deveTransformarTextoEmMaiusculo(){
		MascaradorDeTextos comparador = new MascaradorDeTextos();
		String resultado = comparador.mostraTextoMaiusculo("Rodrigo Martins");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals("RODRIGO MARTINS",resultado);
	}

	@Test
	public void deveTransformarTextoEmMinusculo(){
		MascaradorDeTextos comparador = new MascaradorDeTextos();
		String resultado = comparador.mostraTextoMinusculo("Rodrigo Martins");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals("rodrigo martins",resultado);
	}

	@Test
	public void deveInverterTexto(){
		MascaradorDeTextos comparador = new MascaradorDeTextos();
		String resultado = comparador.mostraTextoInvertido("DB1START");
		// no terceiro parametro zero para exato ou pode ser uma subtração de possíveis calculos para double/float
		Assert.assertEquals("TRATS1BD",resultado);
	}

}
