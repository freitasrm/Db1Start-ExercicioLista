package br.com.db1.db1start.aula2;

public class MascaradorDeTextos {

	public String mostraTextoMaiusculo(String texto){
		return texto.toUpperCase();
	}

	public String mostraTextoMinusculo(String texto){
		return texto.toLowerCase();
	}
	
	public String mostra4PrimeirosCaracteres(String texto){
		return texto.substring(0,4);
	}

	public String mostraAPartir3Caracter(String texto){
		return texto.substring(2);
	}
	
	public String mostra4UltimosCaracteres(String texto){
		return texto.substring(texto.length()-4);
	}
	
	public String substituiPrimeiroNomePorAluno(String texto){
		return texto.replace(texto.substring(0,texto.indexOf(" ")), "Aluno");
	}
	
	public String mostraTextoInvertido(String texto){
		String textoInvertido = "";
		while(textoInvertido.length() != texto.length()){
			textoInvertido += texto.charAt(texto.length()-textoInvertido.length()-1);
		}
		return textoInvertido;
	}
	
	
	
	

}
