package analise_orientada_objeto.animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, double peso, String comida, boolean isVivo) {
        super(nome, idade, peso, comida, isVivo);
    }


    @Override
    public void vocalizar() {
        System.out.println("Está latindo");
    }

    @Override
    public void movimentar() {
        System.out.println("Está correndo");
    }
    
}
