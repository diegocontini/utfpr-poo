package pratica_4_1;

public class Pessoa {
    String nome;
    double altura;
    double peso;

    public Pessoa() {
        nome = "Fulano";
        altura = 1.80;
        peso = 80;
    }

    public Pessoa(String pNome, double pAltura, double pPeso) {
        nome = pNome;
        altura = pAltura;
        peso = pPeso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificacaoIMC() {

        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Magreza";
        }
        if (imc < 25) {
            return "Normal";
        }
        if (imc < 30) {
            return "Sobrepeso";
        }
        if (imc < 35) {
            return "Obesidade grau I";
        }
        if (imc < 40) {
            return "Obesidade grau II";
        }

        return "Obesidade grau III";

    }
}
