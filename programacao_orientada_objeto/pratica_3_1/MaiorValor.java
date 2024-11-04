package pratica_3_1;

public class MaiorValor {
    ///Para enviar para o Moodle, necessário copiar somente o método abaixo. Não a classe inteira.
    public static int maior(int a, int b, int c, int d) {
        int maiorValor = 0;
        int[] arr = new int[] { a, b, c, d };

        for (int i : arr) {
            if (i > maiorValor) {
                maiorValor = i;
            }
        }
        return maiorValor;
    }

    
}
