package programacao_orientada_objeto.pratica_2;

import java.util.Scanner;

public class LerAteNegativo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int quantidadeLeitura = 0;

        int buffer = 0;
        
        while (buffer >= 0) {
            buffer = scan.nextInt();
            quantidadeLeitura++;
            if (buffer >= 0) {
                soma += buffer;
                continue;
            } 
            break;
        }

        System.out.println("Quantidade = " + quantidadeLeitura);
        System.out.println("Soma = " + soma);
    }
}
