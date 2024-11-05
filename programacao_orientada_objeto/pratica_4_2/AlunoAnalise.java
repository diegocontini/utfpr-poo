package pratica_4_2;

import pratica_4_1.Aluno;

public class AlunoAnalise {
    Aluno[] alunos;

    public AlunoAnalise(Aluno[] pAlunos) {
        alunos = pAlunos;

    }

    public void listarAlunosPorGenero(char pGenero) {
        for (Aluno aluno : alunos) {
            if (aluno.genero == pGenero) {
                aluno.print();
            }
        }
    }

    public void listarAlunoMaisVelho() {
        Aluno alunoMaisVelho = new Aluno("Default", 0);
        for (Aluno aluno : alunos) {
            if (aluno.idade > alunoMaisVelho.idade || alunoMaisVelho.idade == 0) {
                alunoMaisVelho = aluno;
            }
        }
        alunoMaisVelho.print();
    }

    public void listarAlunoMaisJovem() {
        Aluno alunoMaisNovo = new Aluno("Default", 0);
        for (Aluno aluno : alunos) {
            if (aluno.idade < alunoMaisNovo.idade || alunoMaisNovo.idade == 0) {
                alunoMaisNovo = aluno;
            }
        }
        alunoMaisNovo.print();
    }

    public double getMediaIdade() {
        int somaIdade = 0;
        for (Aluno aluno : alunos) {
            somaIdade += aluno.idade;
        }
        return (double)somaIdade / alunos.length;
    }
}