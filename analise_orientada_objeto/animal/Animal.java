
package analise.animal;

public abstract class Animal {
    public String nome;
    public int idade;
    public double peso;
    public String comida;
    public boolean isVivo;

    public Animal(String nome, int idade, double peso, String comida, boolean isVivo) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.comida = comida;
        this.isVivo = isVivo;
    }

    public void comer() {
        System.out.println("Está comendo " + comida);
    };

    public abstract void vocalizar();

    public abstract void movimentar();
}
