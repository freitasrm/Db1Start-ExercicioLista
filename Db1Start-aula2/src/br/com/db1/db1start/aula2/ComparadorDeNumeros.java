package br.com.db1.db1start.aula2;

public class ComparadorDeNumeros {
	
	public double menor(double numero1, double numero2){
		// boas praticas, sempre abrir e fechar chaves
		if(numero1 < numero2){
			return numero1;
		}
		return numero2;
	}

	public double menor(double numero1, double numero2, double numero3){
		double menor = menor(numero1,numero2);
		return menor(menor,numero3);
	}
	
	public boolean par(Integer numero1){
		if(numero1%2 == 0){
			return true;
		}
		return false;
	}
	
	public Integer maior(Integer numero1, Integer numero2){
		if(numero1 > numero2){
			return numero1;
		}
		return numero2;
	}


	
}
