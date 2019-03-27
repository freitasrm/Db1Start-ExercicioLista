package br.com.db1.db1start.aula2;

public class CalculadorDeNumeros {
	
	public Integer somar(Integer numero1, Integer numero2){
		return numero1 + numero2;
	}
	
	public Integer subtrair(Integer numero1, Integer numero2){
		return numero1 - numero2;		
	}
	
	public Integer multiplicar(Integer numero1,Integer numero2){
		return numero1 * numero2;
	}
	
	public Integer dividir(Integer numero1, Integer numero2){
		return numero1 / numero2;
	}
	/*
	public boolean ePar(Integer numero1){
		if(numero1%2 == 0){
			return true;
		}
		return false;
	}
	
	public Integer eMaior(Integer numero1, Integer numero2){
		if(numero1 > numero2){
			return numero1;
		}
		return numero2;
	}
	*/
	public Integer contarImparesAte100(Integer numero1){
		int resultado = 0;
		for(Integer i = numero1;i <= 100; i++){
			if(i%2 == 0){
				resultado++;
			}
		}
		return resultado;
	}

	public double calcularAreaTriangulo(double base, double altura){
		return (base*altura)/2;
	}

	public double calcularMedia(double numero1, double numero2, double numero3){
		
		return (numero1+numero2+numero3)/3;		
	}
}
