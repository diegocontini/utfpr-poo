package analise.animal;


public class Hipopotamo extends Animal {

    public Hipopotamo(String nome, int idade, double peso, String comida, boolean isVivo) {
        super(nome, idade, peso, comida, isVivo);
    }


    @Override
    public void vocalizar() {
        System.out.println("Está grunhindo");
    }

    @Override
    public void movimentar() {
        System.out.println("Está nadando");
    }
    
}
