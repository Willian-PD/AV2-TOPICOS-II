package teste.Aula_junit;

public class CalculadoraIMC {
	String calcularImc(double peso, double altura, int idade, String sexo){
		String resultado = ""; 
		double imc = peso/(altura*altura);
		// Índice de massa corporal para adultos entre 20 e 65 anos
		if (idade <= 65 || idade >= 20) {
			if (imc < 16.00) { 
				resultado = "Baixo peso muito grave";
			}
			else if (imc >= 16.00 && imc <= 16.99) { 
				resultado = "Baixo peso grave";
			}
			else if (imc >= 17.00 && imc <= 18.49) { 
				resultado = "Peso baixo";
			}
			else if (imc >= 18.50 && imc <= 24.99) {
				resultado = "Peso normal";
			}
			else if (imc >= 25.00 && imc <= 29.99) {
				resultado = "Sobrepeso";
			}
			else if (imc >= 30.00 && imc <= 34.99) {
				resultado = "Obesidade Grau I";
			}
			else if (imc >= 35.00 && imc <= 34.99) {
				resultado = "Obesidade Grau II";
			}
			else if (imc >= 40.00) {
				resultado = "Obesidade Grau III";
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
					resultado = "Obesidade Grau I";
				}
				else if (imc >= 37.1 && imc <= 41.9) {
					resultado = "Obesidade Grau II";
				}
				else if (imc >= 42.0) {
					resultado = "Obesidade Grau III";
				}
			}
			else if (sexo.equals("masculino")) {
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
					resultado = "Obesidade Grau I";
				}
				else if (imc >= 35.1 && imc <= 39.9) {
					resultado = "Obesidade Grau II";
				}
				else if (imc >= 40.0) {
					resultado = "Obesidade Grau III";
				}
			}
		}
		// Índice de massa corporal para meninas de até 19 anos
		else {
			if (sexo == "feminino") {
				if (idade == 2) {
					if (imc > 14.2 && imc < 16) {
						return "Baixo peso";
					}
					else if (imc >= 16 && imc < 18) {
						return "Peso normal";
					}
					else if (imc >= 18 && imc < 19) {
						return "Sobrepeso";
					}
					else if (imc >= 19) {
						return "Obesidade";
					}
				}
				else if (idade == 4) {	
					if (imc < 14) {
						return "Baixo peso";
					}
					else if (imc > 14 && imc <= 16.9) {
						return "Peso normal";
					}
					else if (imc > 16.9 && imc < 18) {
						return "Sobrepeso";
					}
					else if (imc >= 18) {
						return "Obesidade";
					}
				}
				else if (idade == 6) {
					if (imc < 14.9) {
						return "Baixo peso";
					}
					else if (imc >= 14.9 && imc <= 17) {
						return "Peso normal";
					}
					else if (imc > 17 && imc <= 18.8) {
						return "Sobrepeso";
					}
					else if (imc > 18.8) {
						return "Obesidade";
					}
				}
				else if (idade == 8) {
					if (imc < 14) {
						return "Baixo peso";
					}
					else if (imc >= 14 && imc <= 18.2) {
						return "Peso normal";
					}
					else if (imc > 18.2 && imc <= 20.6) {
						return "Sobrepeso";
					}
					else if (imc > 20.6) {
						return "Obesidade";
					}
				}
				else if (idade == 10) {
					if (imc < 14.5) {
						return "Baixo peso";
					}
					else if (imc >= 14.5 && imc <= 20) {
						return "Peso normal";
					}
					else if (imc > 20 && imc <= 23) {
						return "Sobrepeso";
					}
					else if (imc > 23) {
						return "Obesidade";
					}
				}
				else if (idade == 12) {
					if (imc < 16.4) {
						return "Baixo peso";
					}
					else if (imc >= 16.4 && imc <= 21.7) {
						return "Peso normal";
					}
					else if (imc > 21.7 && imc <= 25) {
						return "Sobrepeso";
					}
					else if (imc > 25) {
						return "Obesidade";
					}
				}
				else if (idade == 14) {
					if (imc < 16.3) {
						return "Baixo peso";
					}
					else if (imc >= 16.3 && imc <= 23.1) {
						return "Peso normal";
					}
					else if (imc > 23.1 && imc <= 27.1) {
						return "Sobrepeso";
					}
					else if (imc > 27.1) {
						return "Obesidade";
					}
				}
				else if (idade == 16) {
					if (imc < 17.3) {
						return "Baixo peso";
					}
					else if (imc >= 17.3 && imc <= 24.6) {
						return "Peso normal";
					}
					else if (imc > 24.6 && imc <= 28.9) {
						return "Sobrepeso";
					}
					else if (imc > 28.9) {
						return "Obesidade";
					}
				}
				else if (idade == 18) {
					if (imc < 18.1) {
						return "Baixo peso";
					}
					else if (imc >= 18.1 && imc <= 25.7) {
						return "Peso normal";
					}
					else if (imc > 25.7 && imc <= 30.1) {
						return "Sobrepeso";
					}
					else if (imc > 30.1) {
						return "Obesidade";
					}
				}
			}
			else if (sexo == "masculino") {
				if (idade == 2) {
					if (imc < 15) {
						return "Baixo peso";
					}
					else if (imc >= 15 && imc <= 18) {
						return "Peso normal";
					}
					else if (imc > 18 && imc <= 19.1) {
						return "Sobrepeso";
					}
					else if (imc > 19.1) {
						return "Obesidade";
					}
				}
				else if (idade == 4) {
					if (imc < 14.2) {
						return "Baixo peso";
					}
					else if (imc >= 14.2 && imc <= 16.98) {
						return "Peso normal";
					}
					else if (imc > 16.98 && imc <= 17.9) {
						return "Sobrepeso";
					}
					else if (imc > 17.9) {
						return "Obesidade";
					}
				}
				else if (idade == 6) {
					if (imc < 14) {
						return "Baixo peso";
					}
					else if (imc >= 14 && imc <= 17) {
						return "Peso normal";
					}
					else if (imc > 17 && imc <= 18.2) {
						return "Sobrepeso";
					}
					else if (imc > 18.2) {
						return "Obesidade";
					}
				}
				else if (idade == 8) {
					if (imc < 14.1) {
						return "Baixo peso";
					}
					else if (imc >= 14.1 && imc <= 17.95) {
						return "Peso normal";
					}
					else if (imc > 17.95 && imc <= 20) {
						return "Sobrepeso";
					}
					else if (imc > 20) {
						return "Obesidade";
					}
				}
				else if (idade == 10) {
					if (imc < 14.6) {
						return "Baixo peso";
					}
					else if (imc >= 14.6 && imc <= 19.3) {
						return "Peso normal";
					}
					else if (imc > 19.3 && imc <= 22) {
						return "Sobrepeso";
					}
					else if (imc > 22) {
						return "Obesidade";
					}
				}
				else if (idade == 12) {
					if (imc < 15.4) {
						return "Baixo peso";
					}
					else if (imc >= 15.4 && imc <= 21) {
						return "Peso normal";
					}
					else if (imc > 21 && imc <= 24) {
						return "Sobrepeso";
					}
					else if (imc > 24) {
						return "Obesidade";
					}
				}
				else if (idade == 14) {
					if (imc < 16.5) {
						return "Baixo peso";
					}
					else if (imc >= 16.5 && imc <= 22.7) {
						return "Peso normal";
					}
					else if (imc > 22.7 && imc <= 26) {
						return "Sobrepeso";
					}
					else if (imc > 26) {
						return "Obesidade";
					}
				}
				else if (idade == 16) {
					if (imc < 17.8) {
						return "Baixo peso";
					}
					else if (imc >= 17.8 && imc <= 24.1) {
						return "Peso normal";
					}
					else if (imc > 24.1 && imc <= 27.5) {
						return "Sobrepeso";
					}
					else if (imc > 27.5) {
						return "Obesidade";
					}
				}
				else if (idade == 18) {
					if (imc < 18.9) {
						return "Baixo peso";
					}
					else if (imc >= 18.9 && imc <= 25.6) {
						return "Peso normal";
					}
					else if (imc > 25.6 && imc <= 28.9) {
						return "Sobrepeso";
					}
					else if (imc > 28.9) {
						return "Obesidade";
					}
				}
			}
		}
		else { 
			resultado = "Valor Invalido";
		}
		return resultado;
	}
	
}
