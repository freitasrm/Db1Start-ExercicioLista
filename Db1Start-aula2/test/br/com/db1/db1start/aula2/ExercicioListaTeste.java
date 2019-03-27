package br.com.db1.db1start.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.aula2.ExercicioLista;

public class ExercicioListaTeste {

	@Test
	public void deveRetornarListaDeNomes() {
		
		ExercicioLista aula11 = new ExercicioLista();
		List<String> nomes = aula11.nomes();
		Assert.assertEquals("Rodrigo",nomes.get(0));
		Assert.assertEquals("João",nomes.get(1));
		
	}

	@Test
	public void deveRetornarListaDeCores() {
		
		ExercicioLista aula11 = new ExercicioLista();
		List<String> resultado = aula11.cores();
		Assert.assertEquals("Laranja",resultado.get(0));
		Assert.assertEquals("Cinza",resultado.get(1));
		Assert.assertEquals("Branco",resultado.get(2));
		
	}
	
	@Test
	public void deveContarListas() {
		
		ExercicioLista aula11 = new ExercicioLista();
		Integer resultado = aula11.contarListas(aula11.cores());
		Assert.assertEquals(3,resultado,0);
	
	}

	@Test
	public void deveOrdenarListaAscendente() {
		ExercicioLista aula11 = new ExercicioLista();
		List<String> resultado = aula11.ordenarListaAscendente(aula11.cores());
		Assert.assertEquals("Branco",resultado.get(0));
		Assert.assertEquals("Cinza",resultado.get(1));
		Assert.assertEquals("Laranja",resultado.get(2));
	}

	@Test
	public void deveRemoverItemDaLista() {
		ExercicioLista aula11 = new ExercicioLista();
		List<String> resultado = aula11.removerListaItem(aula11.cores(),"Laranja");
		Assert.assertEquals("Cinza",resultado.get(0));
		Assert.assertEquals("Branco",resultado.get(1));
	}

	@Test
	public void deveOrdenarListaDescendente() {
		ExercicioLista aula11 = new ExercicioLista();
		List<String> resultado = aula11.ordenarListaDescendente(aula11.cores());
		Assert.assertEquals("Laranja",resultado.get(0));
		Assert.assertEquals("Cinza",resultado.get(1));
		Assert.assertEquals("Branco",resultado.get(2));
	}
	
	@Test
	public void deveListarListasParEImpar() {
		ExercicioLista aula11 = new ExercicioLista();
		
		List<Integer> listaInteira = new ArrayList<Integer>();
		listaInteira.add(1);
		listaInteira.add(2);
		listaInteira.add(3);
		listaInteira.add(4);
		listaInteira.add(5);
		
		List<List<Integer>> resultado = aula11.listaDeListaInteiro(listaInteira);

		//tamanho lista 1 e 2
		Assert.assertEquals(2,resultado.get(0).size(),0);
		Assert.assertEquals(3,resultado.get(1).size(),0);
		//valores lista1
		Assert.assertEquals(2,resultado.get(0).get(0),0);
		Assert.assertEquals(4,resultado.get(0).get(1),0);
		// valores lista2
		Assert.assertEquals(1,resultado.get(1).get(0),0);
		Assert.assertEquals(3,resultado.get(1).get(1),0);
		Assert.assertEquals(5,resultado.get(1).get(2),0);
	}

	@Test
	public void deveListarListaPorCaracterEOrdenado() {
		ExercicioLista aula11 = new ExercicioLista();
		
		List<String> nomes = new ArrayList<>();
		nomes.add("ANA");  
		nomes.add("ANA LAURA");
		nomes.add("JOSE");
		nomes.add("WAGNER");
		nomes.add("RODOLFO");
		nomes.add("ROBERVAL");
		nomes.add("RODOLPHO"); 
		nomes.add("VAGNER");
		nomes.add("JOSÉ");
		nomes.add("JOALDO");  
		nomes.add("CLECIO");  
		nomes.add("JOSÉ");
		nomes.add("MARIA");
		nomes.add("MARCOS");

		Map<String,List<String>> resultado = aula11.listaNomeOrdenadoPrimeiroCaracter(nomes);
		
		//tamanho lista map
		Assert.assertEquals(7,resultado.size(),0);
		//tamanho lista por chave
		Assert.assertEquals(2,resultado.get("A").size(),0);
		Assert.assertEquals(1,resultado.get("C").size(),0);
		Assert.assertEquals(4,resultado.get("J").size(),0);
		Assert.assertEquals(2,resultado.get("M").size(),0);
		Assert.assertEquals(3,resultado.get("R").size(),0);
		Assert.assertEquals(1,resultado.get("V").size(),0);
		Assert.assertEquals(1,resultado.get("W").size(),0);
		//valores lista1
		Assert.assertEquals("ANA",resultado.get("A").get(0));
		Assert.assertEquals("ANA LAURA",resultado.get("A").get(1));
		//valores lista2
		Assert.assertEquals("CLECIO",resultado.get("C").get(0));
		//valores lista3
		Assert.assertEquals("JOALDO",resultado.get("J").get(0));
		Assert.assertEquals("JOSE",resultado.get("J").get(1));
		Assert.assertEquals("JOSÉ",resultado.get("J").get(2));
		Assert.assertEquals("JOSÉ",resultado.get("J").get(3));
		//valores lista4
		Assert.assertEquals("MARCOS",resultado.get("M").get(0));
		Assert.assertEquals("MARIA",resultado.get("M").get(1));
		//valores lista5
		Assert.assertEquals("ROBERVAL",resultado.get("R").get(0));
		Assert.assertEquals("RODOLFO",resultado.get("R").get(1));
		Assert.assertEquals("RODOLPHO",resultado.get("R").get(2));
		//valores lista6
		Assert.assertEquals("VAGNER",resultado.get("V").get(0));
		//valores lista7
		Assert.assertEquals("WAGNER",resultado.get("W").get(0));
	}
	
	@Test
	public void deveSomarListaDeInteiros() {
		ExercicioLista aula11 = new ExercicioLista();
		
		List<Integer> listaInteira = new ArrayList<Integer>();
		listaInteira.add(1);
		listaInteira.add(2);
		listaInteira.add(3);
		listaInteira.add(4);
		listaInteira.add(5);
		
		Integer resultado = aula11.somarListaInteiro(listaInteira);
		Assert.assertEquals(15,resultado,0);
	}

	@Test
	public void deveRetornarMediaDeListaDeDouble() {
		ExercicioLista aula11 = new ExercicioLista();
		
		List<Double> listaDouble = new ArrayList<Double>();
		listaDouble.add(1.2);
		listaDouble.add(2.3);
		listaDouble.add(3.4);
		listaDouble.add(4.5);
		listaDouble.add(5.6);
		
		Double resultado = aula11.mediaListaDouble(listaDouble);
		Assert.assertEquals(3.4,resultado,0);
	}

	@Test
	public void deveRemoverImparesLista() {
		ExercicioLista aula11 = new ExercicioLista();
		
		List<Integer> listaInteira = new ArrayList<Integer>();
		listaInteira.add(1);
		listaInteira.add(2);
		listaInteira.add(3);
		listaInteira.add(4);
		listaInteira.add(5);
		
		List<Integer> resultado = aula11.removerListaImpares(listaInteira);
		Assert.assertEquals(2,resultado.get(0),0);
		Assert.assertEquals(4,resultado.get(1),0);
	}

	@Test
	public void deveRemoverConsoantes() {
		ExercicioLista fras = new ExercicioLista();
		String resultado = fras.mostraSomenteVogais("a pipa do vovô não sobe mais");
		Assert.assertEquals("aiaooooeai",resultado);
	}

}

