package teste.Aula_junit;

public class CalculadoraIMC {
	String calcularImc(double peso, double altura, int idade, String sexo){
		String resultado = ""; 
		double imc = peso/(altura*altura);
		// Índice de massa corporal para adultos entre 20 e 65 anos
		if (idade < 65 || idade > 20) {
			if (imc < 15.99) { 
				resultado = "Baixo peso muito grave";
			}
			if (imc >= 16.00 && imc <= 16.99) { 
				resultado = "Baixo peso grave";
			}
			if (imc >= 17.00 && imc <= 18.49) { 
				resultado = "Peso baixo";
			}
			else if (imc >= 18.50 && imc <= 24.99) {
				resultado = "Peso normal";
			}
			else if (imc >= 25.00 && imc <= 29.99) {
				resultado = "Sobrepeso";
			}
			else if (imc >= 30.00 && imc <= 34.99) {
				resultado = "Obesidade grau I";
			}
			else if (imc >= 35.00 && imc <= 34.99) {
				resultado = "Obesidade grau II";
			}
			else if (imc >= 40.00) {
				resultado = "Obesidade grau III";
			}
		}
		// Índice de massa corporal para mulheres acima de 65 anos
		else if (idade > 65) {
			if (sexo.equals("feminino")) {
				if (imc < 21.9) {
					resultado = "Baixo peso grave";
				}
				else if (imc >= 22.0 && imc <= 27.0) {
					resultado = "Peso normal";
				}
				else if (imc >= 27.1 && imc <= 32.0) {
					resultado = "Sobrepeso";
				}
				else if (imc >= 32.1 && imc <= 47.0) {
					resultado = "Obesidade grau I";
				}
				else if (imc >= 37.1 && imc <= 41.9) {
					resultado = "Obesidade grau II";
				}
				else if (imc >= 42.0) {
					resultado = "Obesidade grau III";
				}
			}
			if (sexo.equals("masculino")) {
				if (imc < 21.9) {
					resultado = "Baixo peso grave";
				}
				else if (imc >= 22.0 && imc <= 27.0) {
					resultado = "Peso normal";
				}
				else if (imc >= 27.1 && imc <= 30.0) {
					resultado = "Sobrepeso";
				}
				else if (imc >= 30.1 && imc <= 35.0) {
					resultado = "Obesidade grau I";
				}
				else if (imc >= 35.1 && imc <= 39.9) {
					resultado = "Obesidade grau II";
				}
				else if (imc >= 40.0) {
					resultado = "Obesidade grau III";
				}
			}
		}
		// Índice de massa corporal para meninas de até 19 anos
		else if (idade < 20) {
			if (sexo.equals("feminino")) {
				if (imc < 5.0) {
					resultado = "Baixo peso";
				}
				else if (imc >= 5.1 && imc <= 85.0) {
					resultado = "Peso normal";
				}
				else if (imc >= 85.1 && imc <= 95.0) {
					resultado = "Sobrepeso";
				}
				else if (imc >= 95.0) {
					resultado = "Obesidade";
				}
			}
			if (sexo.equals("masculino")) {
				if (imc < 5.0) {
					resultado = "Baixo peso";
				}
				else if (imc >= 5.1 && imc <= 85.0) {
					resultado = "Peso normal";
				}
				else if (imc >= 85.1 && imc <= 95.0) {
					resultado = "Sobrepeso";
				}
				else if (imc >= 95.0) {
					resultado = "Obesidade";
				}
			}
		}
		else { 
			resultado = "Valor Invalido";
		}
		return resultado;
		
	}
	
}
