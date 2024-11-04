package pratica_3_1;

public class ProcuraMaiorValor {
    ///Para enviar para o Moodle, necessário copiar somente o método abaixo. Não a classe inteira.
    public static int procuraMaiorValor(int[] vet) {
        int maiorValor = 0;
        for (int i : vet) {
            if (i > maiorValor) {
                maiorValor = i;
            }
        }
        return maiorValor;
    }
}
