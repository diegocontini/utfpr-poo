package analise_orientada_objeto.animal;


public class Leao extends Animal {

    public Leao(String nome, int idade, double peso, String comida, boolean isVivo) {
        super(nome, idade, peso, comida, isVivo);
    }

    @Override
    public void comer() {
        System.out.println("Está comendo");
    }

    @Override
    public void vocalizar() {
        System.out.println("Está rugindo");
    }

    @Override
    public void movimentar() {
        System.out.println("Está correndo");
    }
    
}
