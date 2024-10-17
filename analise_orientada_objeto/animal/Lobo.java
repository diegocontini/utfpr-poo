package analise.animal;


public class Lobo extends Animal {

    public Lobo(String nome, int idade, double peso, String comida, boolean isVivo) {
        super(nome, idade, peso, comida, isVivo);
    }


    @Override
    public void vocalizar() {
        System.out.println("Está uivando");
    }

    @Override
    public void movimentar() {
        System.out.println("Está andando na neve");
    }
    
}
