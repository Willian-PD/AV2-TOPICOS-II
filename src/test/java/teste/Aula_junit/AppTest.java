package teste.Aula_junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testeBaixoPesoMuitoGraveJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso muito grave", calc.calcularImc(49.0, 1.73, 20, ""));
    }

    @Test
    public void testeBaixoPesoMuitoGraveVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso muito grave", calc.calcularImc(49.0, 1.73, 65, ""));
    }

    @Test
    public void testeBaixoPesoLimiteMinimoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(50.0, 1.749, 20, ""));
    }

    @Test
    public void testeBaixoPesoLimiteMinimoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(50.0, 1.759, 65, ""));
    }

    @Test
    public void testeBaixoPesoLimiteMaximoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(49.0, 1.749, 20, ""));
    }

    @Test
    public void testeBaixoPesoLimiteMaximoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(49.0, 1.749, 65, ""));
    }

    @Test
    public void testeBaixoPesoLimiteMaximoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(56.0, 1.741, 65, ""));
    }

    @Test
    public void testeBaixoPesoLimiteMaximoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(56.0, 1.741, 20, ""));
    }

    @Test
    public void testeBaixoPesoLimiteMinimoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(52.0, 1.74, 20, ""));
    }

    @Test
    public void testeBaixoPesoLimiteMinimoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(52.0, 1.74, 65, ""));
    }

    @Test
    public void testePesoNormalLimiteMaximoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(72.0, 1.70, 20, ""));
    }

    @Test
    public void testePesoNormalLimiteMaximoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(72.0, 1.70, 65, ""));
    }

    @Test
    public void testePesoNormalLimiteMinimoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(53.0, 1.69, 20, ""));
    }

    @Test
    public void testePesoNormalLimiteMinimoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(53.0, 1.69, 65, ""));
    }

    @Test
    public void testeSobrePesoLimiteMaximoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(87.0, 1.71, 20, ""));
    }

    @Test
    public void testeSobrePesoLimiteMaximoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(87.0, 1.71, 65, ""));
    }

    @Test
    public void testeSobrePesoLimiteMinimoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(74.0, 1.71, 20, ""));
    }

    @Test
    public void testeSobrePesoLimiteMinimoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(74.0, 1.71, 65, ""));
    }

    @Test
    public void testeObesidadeGrauILiminteMaximoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau I", calc.calcularImc(96.0, 1.66, 20, ""));
    }

    @Test
    public void testeObesidadeGrauILiminteMaximoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau I", calc.calcularImc(96.0, 1.66, 65, ""));
    }

    @Test
    public void testeObesidadeGrauILiminteMinimoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau I", calc.calcularImc(86.0, 1.69, 20, ""));
    }

    @Test
    public void testeObesidadeGrauILiminteMinimoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau I", calc.calcularImc(86.0, 1.69, 65, ""));
    }

    @Test
    public void testeObesidadeGrauIILimiteMaximoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau II", calc.calcularImc(114.0, 1.69, 20, ""));
    }

    @Test
    public void testeObesidadeGrauIILimiteMaximoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau II", calc.calcularImc(114.0, 1.69, 65, ""));
    }

    @Test
    public void testeObesidadeGrauIILimiteMinimoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau II", calc.calcularImc(100.0, 1.69, 20, ""));
    }

    @Test
    public void testeObesidadeGrauIILimiteMinimoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau II", calc.calcularImc(100.0, 1.69, 65, ""));
    }

    @Test
    public void testeObesidadeGrauIIILimiteMaximoJovem() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau III", calc.calcularImc(120.0, 1.70, 20, ""));
    }

    @Test
    public void testeObesidadeGrauIIILimiteMaximoVelho() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau III", calc.calcularImc(120.0, 1.70, 65, ""));
    }

    //IDOSOS

    @Test
    public void testeBaixoPesoIdosaLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(63.0, 1.70, 66, "feminino"));
    }

    @Test
    public void testeBaixoPesoIdosoLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(63.0, 1.70, 66, "masculino"));
    }

    //------------------------------------------------------------------------------//

    @Test
    public void testePesoNormalIdosaLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(79.0, 1.711, 66, "feminino"));
    }

    @Test
    public void testePesoNormalIdosaLimiteMinimo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(65.0, 1.71, 66, "feminino"));
    }

    @Test
    public void testePesoNormalIdosoLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(79.0, 1.711, 66, "masculino"));
    }

    @Test
    public void testePesoNormalIdosoLimiteMinimo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(65.0, 1.71, 66, "masculino"));
    }

    //--------------------------------------------------------------------------------//

    @Test
    public void testeSobrepesoIdosaLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(94.0, 1.714, 66, "feminino"));
    }

    @Test
    public void testeSobrepesoIdosaLimiteMinimo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(79.0, 1.71, 66, "feminino"));
    }

    @Test
    public void testeObesidadeGrauILimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau I", calc.calcularImc(88.0, 1.71, 66, "masculino"));
    }

    @Test
    public void testeSobrepesoIdosoLimiteMinimo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(79.0, 1.71, 66, "masculino"));
    }

    //-------------------------------------------------------------------------------//

    @Test
    public void testeObesidadeGrauIIIdosaLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau II", calc.calcularImc(112.0, 1.71, 65, "feminino"));
    }

    @Test
    public void testeObesidadeGrauIIdosaLimiteMinimo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau I", calc.calcularImc(94.0, 1.71, 66, "feminino"));
    }

    @Test
    public void testeObesidadeGrauIIIdosoLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau II", calc.calcularImc(100.0, 1.72, 66, "masculino"));
    }

    @Test
    public void testeObesidadeGrauIIdosoLimiteMinimo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau I", calc.calcularImc(88.0, 1.71, 66, "masculino"));
    }

    //------------------------------------------------------------------------//

    @Test
    public void testeObesidadeGrauIIIdosaLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau II", calc.calcularImc(122.0, 1.71, 66, "feminino"));
    }

    @Test
    public void testeObesidadeGrauIIIdosaLimiteMinimo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau II", calc.calcularImc(109.0, 1.71, 66, "feminino"));
    }

    @Test
    public void testeObesidadeGrauIIIdosoLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau III", calc.calcularImc(116.0, 1.70, 66, "masculino"));
    }

    @Test
    public void testeObesidadeGrauIIIdosoLimiteMinimo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau II", calc.calcularImc(102.0, 1.70, 66, "masculino"));
    }

    //--------------------------------------------------------------------------//

    @Test
    public void testeObesidadeGrauIIIIdosaLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau III", calc.calcularImc(123.0, 1.70, 66, "feminino"));
    }

    @Test
    public void testeObesidadeGrauIIIIdosoLimiteMaximo() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade Grau III", calc.calcularImc(116.0, 1.70, 66, "masculino"));
    }

    //-----------------------------------------------------------------------------------//

    //Crianças//
    //meninas 2 anos//

    @Test
    public void testeBaixoPesoCriancaMenina2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(12.0, 0.9, 2, "feminino"));
    }

    @Test
    public void testePesoNormalCriancaMenina2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(14.0, 0.9, 2, "feminino"));
    }

    @Test
    public void testeSobrepesoCriancaMenina2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(15.0, 0.9, 2, "feminino"));
    }

    @Test
    public void testeObesidadeCriancaMenina2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(18.0, 0.96, 2, "feminino"));
    }

    //meninos 2 anos//

    @Test
    public void testeBaixoPesoMenino2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(12.0, 0.9, 2, "masculino"));
    }

    @Test
    public void testePesoNormalMenino2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(14.0, 0.9, 2, "masculino"));
    }

    @Test
    public void testeSobrepesoMenino2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(15.0, 0.9, 2, "masculino"));
    }

    @Test
    public void testeObesidadeMenino2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(18.0, 0.9, 2, "masculino"));
    }

    //meninas 4 anos//

    @Test
    public void testeBaixoPesoMenina4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(14.0, 1.02, 4, "feminino"));
    }

    @Test
    public void testePesoNormalMenina4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(17.0, 1.02, 4, "feminino"));
    }

    @Test
    public void testeSobrepesoMenina4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(18.0, 1.02, 4, "feminino"));
    }

    @Test
    public void testeObesidadeMenina4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(20.0, 1.02, 4, "feminino"));
    }

    //meninos 4 anos//

    @Test
    public void testeBaixoPesoMenino4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(15.0, 1.03, 4, "masculino"));
    }

    @Test
    public void testePesoNormalMenino4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(17.0, 1.03, 4, "masculino"));
    }

    @Test
    public void testeSobrepesoMenino4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(19.0, 1.031, 4, "masculino"));
    }

    @Test
    public void testeObesidadeMenino4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(20.0, 1.03, 4, "masculino"));
    }

    //meninas 6 anos//

    @Test
    public void testeBaixoPesoMenina6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(16.0, 1.07, 6, "feminino"));
    }

    @Test
    public void testePesoNormalMenina6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(19.0, 1.07, 6, "feminino"));
    }

    @Test
    public void testeSobrepesoMenina6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(21.0, 1.08, 6, "feminino"));
    }

    @Test
    public void testeObesidadeMenina6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(22.0, 1.08, 6, "feminino"));
    }

    //meninos 6 anos//

    @Test
    public void testeBaixoPesoMenino6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(16.0, 1.07, 6, "masculino"));
    }

    @Test
    public void testePesoNormalMenino6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(19.0, 1.07, 6, "masculino"));
    }

    @Test
    public void testeSobrepesoMenino6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(21.0, 1.08, 6, "masculino"));
    }

    @Test
    public void testeObesidadeMenino6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(22.0, 1.08, 6, "masculino"));
    }

    //meninas 8 anos//

    @Test
    public void testeBaixoPesoMenina8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(20.0, 1.20, 8, "feminino"));
    }

    @Test
    public void testePesoNormalMenina8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(23.0, 1.20, 8, "feminino"));
    }

    @Test
    public void testeSobrepesoMenina8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(28.0, 1.21, 8, "feminino"));
    }

    @Test
    public void testeObesidadeMenina8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(32.0, 1.21, 8, "feminino"));
    }

    //meninos 8 anos//

    @Test
    public void testeBaixoPesoMenino8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(20.0, 1.20, 8, "masculino"));
    }

    @Test
    public void testePesoNormalMenino8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(23.0, 1.20, 8, "masculino"));
    }

    @Test
    public void testeSobrepesoMenino8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(28.0, 1.21, 8, "masculino"));
    }

    @Test
    public void testeObesidadeMenino8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(30.0, 1.21, 8, "masculino"));
    }

    //meninas 10 anos//

    @Test
    public void testeBaixoPesoMenina10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(24.0, 1.299, 10, "feminino"));
    }

    @Test
    public void testePesoNormalMenina10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(27.0, 1.29, 10, "feminino"));
    }

    @Test
    public void testeSobrepesoMenina10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(34.0, 1.29, 10, "feminino"));
    }

    @Test
    public void testeObesidadeMenina10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(39.0, 1.29, 10, "feminino"));
    }

    //meninos 10 anos//

    @Test
    public void testeBaixoPesoMenino10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(24.0, 1.299, 10, "masculino"));
    }

    @Test
    public void testePesoNormalMenino10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(27.0, 1.29, 10, "masculino"));
    }

    @Test
    public void testeSobrepesoMenino10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(34.0, 1.29, 10, "masculino"));
    }

    @Test
    public void testeObesidadeMenino10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(38.0, 1.29, 10, "masculino"));
    }

    //meninas 12 anos//

    @Test
    public void testeBaixoPesoMenina12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(30.0, 1.38, 12, "feminino"));
    }

    @Test
    public void testePesoNormalMenina12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(33.0, 1.38, 12, "feminino"));
    }

    @Test
    public void testeSobrepesoMenina12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(42.0, 1.38, 12, "feminino"));
    }

    @Test
    public void testeObesidadeMenina12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(48.0, 1.38, 12, "feminino"));
    }

    //meninos 12 anos//

    @Test
    public void testeBaixoPesoMenino12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(29.0, 1.38, 12, "masculino"));
    }

    @Test
    public void testePesoNormalMenino12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(33.0, 1.38, 12, "masculino"));
    }

    @Test
    public void testeSobrepesoMenino12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(42.0, 1.38, 12, "masculino"));
    }

    @Test
    public void testeObesidadeMenino12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(47.0, 1.38, 12, "masculino"));
    }

    //meninas 14 anos//

    @Test
    public void testeBaixoPesoMenina14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(37.0, 1.52, 14, "feminino"));
    }

    @Test
    public void testePesoNormalMenina14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(42.0, 1.52, 14, "feminino"));
    }

    @Test
    public void testeSobrepesoMenina14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(55.0, 1.52, 14, "feminino"));
    }

    @Test
    public void testeObesidadeMenina14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(61.0, 1.50, 14, "feminino"));
    }

    //meninos 14 anos//

    @Test
    public void testeBaixoPesoMenino14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(37.0, 1.51, 14, "masculino"));
    }

    @Test
    public void testePesoNormalMenino14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(42.0, 1.51, 14, "masculino"));
    }

    @Test
    public void testeSobrepesoMenino14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(54.0, 1.50, 14, "masculino"));
    }

    @Test
    public void testeObesidadeMenino14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(61.0, 1.50, 14, "masculino"));
    }

    //meninas 16 anos//

    @Test
    public void testeBaixoPesoMenina16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(45.0, 1.62, 16, "feminino"));
    }

    @Test
    public void testePesoNormalMenina16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(52.0, 1.62, 16, "feminino"));
    }

    @Test
    public void testeSobrepesoMenina16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(65.0, 1.62, 16, "feminino"));
    }

    @Test
    public void testeObesidadeMenina16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(77.0, 1.62, 16, "feminino"));
    }

    //meninos 16 anos//

    @Test
    public void testeBaixoPesoMenino16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(45.0, 1.62, 16, "masculino"));
    }

    @Test
    public void testePesoNormalMenino16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(52.0, 1.62, 16, "masculino"));
    }

    @Test
    public void testeSobrepesoMenino16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(65.0, 1.62, 16, "masculino"));
    }

    @Test
    public void testeObesidadeMenino16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(74.0, 1.62, 16, "masculino"));
    }

    //meninas 18 anos//

    @Test
    public void testePesoNormalMenina18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(45.0, 1.62, 18, "feminino"));
    }

    @Test
    public void testePesoNormalMenina18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(60.0, 1.62, 18, "feminino"));
    }

    @Test
    public void testeSobrepesoMenina18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(78.0, 1.62, 18, "feminino"));
    }

    @Test
    public void testeObesidadeMenina18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(90.0, 1.62, 18, "feminino"));
    }

    //meninos 18 anos//

    @Test
    public void testeBaixoPesoMenino18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(53.0, 1.70, 18, "masculino"));
    }

    @Test
    public void testePesoNormalMenino18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(60.0, 1.70, 18, "masculino"));
    }

    @Test
    public void testeSobrepesoMenino18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(78.0, 1.70, 18, "masculino"));
    }

    @Test
    public void testeObesidadeMenino18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(90.0, 1.70, 18, "masculino"));
    }

}