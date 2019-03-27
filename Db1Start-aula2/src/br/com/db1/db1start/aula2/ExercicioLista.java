package br.com.db1.db1start.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercicioLista {

		public List<String> nomes(){
			List<String> nomes = new ArrayList<>();
			nomes.add("Rodrigo");
			nomes.add("João");
			return nomes;
		}
		
		public List<String> cores(){
			List<String> cores = new ArrayList<>();
			cores.add("Laranja");
			cores.add("Cinza");
			cores.add("Branco");
			return cores;
		}

		public Integer contarListas(List<String> lista){
			return lista.size();
		}
		
		public List<String> adicionar3Remover2Posicao(String texto1, String texto2, String texto3){
			List<String> textos = new ArrayList<>();
			textos.add(texto1);
			textos.add(texto2);
			textos.add(texto3);
			textos.remove(1);
			return textos;
		}
		
		public List<String> ordenarListaAscendente(List<String> lista){
			Collections.sort(lista);					
			return lista;
		}
		
		public List<String> removerListaItem(List<String> lista, String itemRemover){
			lista.remove(itemRemover);
			return lista;
				
		}

		public List<String> ordenarListaDescendente(List<String> lista){
			Collections.sort(lista,Collections.reverseOrder());					
			return lista;
		}
		
		public List<List<Integer>> listaDeListaInteiro(List<Integer> lista){

			List<List<Integer>> listaDeLista = new ArrayList<List<Integer>>();
			List<Integer> listaPar = new ArrayList<Integer>();
			List<Integer> listaImpar = new ArrayList<Integer>();
			
			for(int i = 0; i < lista.size(); i++){
				if(new ComparadorDeNumeros().par(lista.get(i))) {
					listaPar.add(lista.get(i));
				} else {
					listaImpar.add(lista.get(i));
				}
			}
			
			listaDeLista.add(listaPar);
			listaDeLista.add(listaImpar);
			
			return listaDeLista;
		}
		
		public Map<String,List<String>> listaNomeOrdenadoPrimeiroCaracter(List<String> lista){
						
			List<String> resultado  = ordenarListaAscendente(lista);
			Map<String,List<String>> map = new HashMap<>();
			
			for(int i= 0; i < resultado.size(); i++ ) {
				if(!map.containsKey(resultado.get(i).substring(0,1))){
					map.put(resultado.get(i).substring(0,1),new ArrayList<String>());
				}
				map.get(resultado.get(i).substring(0,1)).add(resultado.get(i));
			}
			return map;
		}
		
		public Integer somarListaInteiro(List<Integer> lista) {
			Integer resultado = 0;
			for(Integer inteiro : lista) {
				resultado += inteiro;
			}
			return resultado;
		}

		public Double mediaListaDouble(List<Double> lista) {
			Double resultado = 0.0;
			Integer i = 0;
			for(Double inteiro : lista) {
				resultado += inteiro;
				i++;
			}
			return resultado/i;
		}

		public Integer menorListaInteiro(List<Integer> lista) {
			List<Integer> resultado = lista;
			Collections.sort(resultado);
			return resultado.get(0);
		}

		public Integer maiorListaInteiro(List<Integer> lista) {
			List<Integer> resultado = lista;
			Collections.sort(resultado);
			return resultado.get(resultado.size());
		}
		
		public List<Integer> removerListaImpares(List <Integer> lista){
			
			List<Integer> resultado = lista;
			for(int i = 0; i < lista.size(); i++) {
				if(!new ComparadorDeNumeros().par(lista.get(i))) {
					resultado.remove(lista.get(i));
				}
			}
			return resultado;
		}
		
		public String mostraSomenteVogais(String texto) {
			return texto.replaceAll("[^AEIOUaeiou]","");
		}
		
}