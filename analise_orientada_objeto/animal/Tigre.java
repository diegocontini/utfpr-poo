package analise_orientada_objeto.animal;

public class Tigre extends Animal {

    public Tigre(String nome, int idade, double peso, String comida, boolean isVivo) {
        super(nome, idade, peso, comida, isVivo);
    }


    @Override
    public void vocalizar() {
        System.out.println("Está bramando");
    }

    @Override
    public void movimentar() {
        System.out.println("Está andando");
    }
    
}
