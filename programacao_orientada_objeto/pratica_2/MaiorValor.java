package pratica_2;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String args[]) {
        int maiorValor = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            
            int temp = scan.nextInt();
            if (temp > maiorValor) {
                maiorValor = temp;
            }
        }
        System.out.println(maiorValor);
    }
}
