package pratica_2;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1 = scanner.nextDouble();
        double valor2 = scanner.nextDouble();
        double valor3 = scanner.nextDouble();
        double valor4 = scanner.nextDouble();
        
        double media = (valor1 + valor2 + valor3 + valor4) / 4;

        // Imprime a média com uma casa decimal
        System.out.printf("%.1f%n", media);

        scanner.close();
    }
}
