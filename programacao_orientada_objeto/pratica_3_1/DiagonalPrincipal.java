package pratica_3_1;

public class DiagonalPrincipal {
    /// Para enviar para o Moodle, necessário copiar somente o método abaixo. Não a
    /// classe inteira.
    public static void printDiagonalPrincipal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

}
