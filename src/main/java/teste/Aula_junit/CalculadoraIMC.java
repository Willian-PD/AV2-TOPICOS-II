package teste.Aula_junit;

public class CalculadoraIMC {
    String calcularImc(double peso, double altura, int idade, String sexo) {
        String resultado = "";
        double imc = peso / (altura * altura);
        // Índice de massa corporal para pessoas acima de 65 anos
        if (idade > 65) {
            if (sexo.equals("feminino")) {
                if (imc <= 21.9) {
                    resultado = "Baixo peso";
                } else if (imc <= 27.0) {
                    resultado = "Peso normal";
                } else if (imc <= 32.0) {
                    resultado = "Sobrepeso";
                } else if (imc <= 37.0) {
                    resultado = "Obesidade Grau I";
                } else if (imc <= 41.9) {
                    resultado = "Obesidade Grau II";
                } else if (imc > 41.9) {
                    resultado = "Obesidade Grau III";
                }
            }
            if (sexo.equals("masculino")) {
                if (imc <= 21.9) {
                    resultado = "Baixo peso";
                } else if (imc <= 27.0) {
                    resultado = "Peso normal";
                } else if (imc <= 30.0) {
                    resultado = "Sobrepeso";
                } else if (imc <= 35.0) {
                    resultado = "Obesidade Grau I";
                } else if (imc <= 39.9) {
                    resultado = "Obesidade Grau II";
                } else if (imc > 39.9) {
                    resultado = "Obesidade Grau III";
                }
            }
        }
        // Índice de massa corporal para adultos entre 20 e 65 anos
        if (idade >= 20 && idade <= 65) {
            if (imc <= 16.0) {
                resultado = "Baixo peso muito grave";
            } else if (imc <= 16.99) {
                resultado = "Baixo peso grave";
            } else if (imc <= 18.49) {
                resultado = "Baixo peso";
            } else if (imc <= 24.99) {
                resultado = "Peso normal";
            } else if (imc <= 29.99) {
                resultado = "Sobrepeso";
            } else if (imc <= 34.99) {
                resultado = "Obesidade Grau I";
            } else if (imc <= 39.99) {
                resultado = "Obesidade Grau II";
            } else if (imc > 39.99) {
                resultado = "Obesidade Grau III";
            }
        }
        // Índice de massa corporal para meninas de até 19 anos
        else if (sexo == "feminino") {
            if (idade <= 2) {
                if (imc > 14.2 && imc < 16) {
                    resultado = "Baixo peso";
                } else if (imc >= 16 && imc < 18) {
                    resultado = "Peso normal";
                } else if (imc >= 18 && imc < 19) {
                    resultado = "Sobrepeso";
                } else if (imc >= 19) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 4) {
                if (imc < 14) {
                    resultado = "Baixo peso";
                } else if (imc >= 14 && imc < 16.9) {
                    resultado = "Peso normal";
                } else if (imc >= 16.9 && imc < 18) {
                    resultado = "Sobrepeso";
                } else if (imc >= 18) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 6) {
                if (imc < 14.9) {
                    resultado = "Baixo peso";
                } else if (imc >= 14.9 && imc < 17) {
                    resultado = "Peso normal";
                } else if (imc >= 17 && imc < 18.8) {
                    resultado = "Sobrepeso";
                } else if (imc >= 18.8) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 8) {
                if (imc < 14) {
                    resultado = "Baixo peso";
                } else if (imc >= 14 && imc < 18.2) {
                    resultado = "Peso normal";
                } else if (imc >= 18.2 && imc < 20.6) {
                    resultado = "Sobrepeso";
                } else if (imc >= 20.6) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 10) {
                if (imc < 14.5) {
                    resultado = "Baixo peso";
                } else if (imc >= 14.5 && imc < 20) {
                    resultado = "Peso normal";
                } else if (imc >= 20.0 && imc < 23.0) {
                    resultado = "Sobrepeso";
                } else if (imc >= 23.0) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 12) {
                if (imc <= 16.4) {
                    resultado = "Baixo peso";
                } else if (imc >= 16.4 && imc < 21.7) {
                    resultado = "Peso normal";
                } else if (imc >= 21.7 && imc < 25.0) {
                    resultado = "Sobrepeso";
                } else if (imc >= 25.0) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 14) {
                if (imc <= 16.3) {
                    resultado = "Baixo peso";
                } else if (imc >= 16.3 && imc < 23.1) {
                    resultado = "Peso normal";
                } else if (imc >= 23.1 && imc < 27.1) {
                    resultado = "Sobrepeso";
                } else if (imc >= 27.1) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 16) {
                if (imc <= 17.3) {
                    resultado = "Baixo peso";
                } else if (imc >= 17.3 && imc < 24.6) {
                    resultado = "Peso normal";
                } else if (imc >= 24.6 && imc < 28.9) {
                    resultado = "Sobrepeso";
                } else if (imc >= 28.9) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 18) {
                if (imc < 18.1) {
                    resultado = "Baixo peso";
                } else if (imc >= 18.1 && imc < 25.7) {
                    resultado = "Peso normal";
                } else if (imc >= 25.7 && imc < 30.1) {
                    resultado = "Sobrepeso";
                } else if (imc >= 30.1) {
                    resultado = "Obesidade";
                }
            }
        } else if (sexo == "masculino") {
            if (idade <= 2) {
                if (imc <= 15.0) {
                    resultado = "Baixo peso";
                } else if (imc >= 15.0 && imc < 18.0) {
                    resultado = "Peso normal";
                } else if (imc >= 18.0 && imc < 19.1) {
                    resultado = "Sobrepeso";
                } else if (imc >= 19.1) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 4) {
                if (imc <= 14.2) {
                    resultado = "Baixo peso";
                } else if (imc >= 14.2 && imc < 16.98) {
                    resultado = "Peso normal";
                } else if (imc >= 16.98 && imc < 17.9) {
                    resultado = "Sobrepeso";
                } else if (imc >= 17.9) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 6) {
                if (imc <= 14.0) {
                    resultado = "Baixo peso";
                } else if (imc >= 14.0 && imc < 17.0) {
                    resultado = "Peso normal";
                } else if (imc >= 17.0 && imc < 18.2) {
                    resultado = "Sobrepeso";
                } else if (imc >= 18.2) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 8) {
                if (imc <= 14.1) {
                    resultado = "Baixo peso";
                } else if (imc >= 14.1 && imc < 17.95) {
                    resultado = "Peso normal";
                } else if (imc >= 17.95 && imc < 20.0) {
                    resultado = "Sobrepeso";
                } else if (imc >= 20.0) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 10) {
                if (imc <= 14.6) {
                    resultado = "Baixo peso";
                } else if (imc >= 14.6 && imc < 19.3) {
                    resultado = "Peso normal";
                } else if (imc >= 19.3 && imc < 22.0) {
                    resultado = "Sobrepeso";
                } else if (imc >= 22.0) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 12) {
                if (imc <= 15.4) {
                    resultado = "Baixo peso";
                } else if (imc >= 15.4 && imc < 21) {
                    resultado = "Peso normal";
                } else if (imc >= 21.0 && imc < 24.0) {
                    resultado = "Sobrepeso";
                } else if (imc >= 24.0) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 14) {
                if (imc <= 16.5) {
                    resultado = "Baixo peso";
                } else if (imc >= 16.5 && imc < 22.7) {
                    resultado = "Peso normal";
                } else if (imc >= 22.7 && imc < 26.0) {
                    resultado = "Sobrepeso";
                } else if (imc >= 26.0) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 16) {
                if (imc <= 17.8) {
                    resultado = "Baixo peso";
                } else if (imc >= 17.8 && imc < 24.1) {
                    resultado = "Peso normal";
                } else if (imc >= 24.1 && imc < 27.5) {
                    resultado = "Sobrepeso";
                } else if (imc >= 27.5) {
                    resultado = "Obesidade";
                }
            } else if (idade <= 18) {
                if (imc <= 18.9) {
                    resultado = "Baixo peso";
                } else if (imc >= 18.9 && imc < 25.6) {
                    resultado = "Peso normal";
                } else if (imc >= 25.6 && imc < 28.9) {
                    resultado = "Sobrepeso";
                } else if (imc >= 28.9) {
                    resultado = "Obesidade";
                }
            }
        } else {
            resultado = "Valor Invalido";
        }
        return resultado;
    }

}