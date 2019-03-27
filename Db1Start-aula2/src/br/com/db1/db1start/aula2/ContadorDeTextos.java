package br.com.db1.db1start.aula2;

public class ContadorDeTextos {

	public Integer contarCaracteres(String texto){
		return texto.length();
	}

	public Integer contarVogais(String texto){
		String resultado = texto.replaceAll("[^AEIOUaeiou]","");
		return resultado.length();
	}

	public Integer contarCaracteresSemEspaco(String texto){
		return contarCaracteres(texto.replace(" ",""));
	}

}
