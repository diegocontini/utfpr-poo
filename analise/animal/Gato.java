package analise.animal;


public class Gato extends Animal {

    public Gato(String nome, int idade, double peso, String comida, boolean isVivo) {
        super(nome, idade, peso, comida, isVivo);
    }


    @Override
    public void vocalizar() {
        System.out.println("Está miando");
    }

    @Override
    public void movimentar() {
        System.out.println("Está subindo nas coisas");
    }
    
}
