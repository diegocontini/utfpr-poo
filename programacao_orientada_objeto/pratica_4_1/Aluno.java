package pratica_4_1;

public class Aluno {
    public String nome;
    public int idade;
    public char genero;
    public long ra;

    public Aluno() {
        nome = "Aluno";
        idade = 18;
        genero = 'M';
        ra = 123456789;
    };

    public Aluno(String pNome, int pIdade) {
        nome = pNome;
        idade = pIdade;
        genero = 'M';
        ra = 123456789;
    }

    public Aluno(String pNome, char pGenero, long pRa) {
        nome = pNome;
        idade = 18;
        genero = pGenero;
        ra = pRa;
    }
    public Aluno(String pNome,  int pIdade, char pGenero) {
        nome = pNome;
        idade = pIdade;
        genero = pGenero;
        
    }
    public void print(){
        System.out.println(nome + " - " + idade + " - " + genero);
    }
}
