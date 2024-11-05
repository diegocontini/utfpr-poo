package pratica_4_2;

public class Financeiro {
    private double saldo = 0;

    public void processarLancamento(Lancamento lancamento) {
        boolean isReceber = lancamento.getTipo() == 1;
        boolean isPagar = !isReceber;
        String display = isPagar ? "Pagar" : "Receber";

        System.out.println("Lançamento: " + display + " - " + lancamento.getDescricao() + " - "
                + String.format("%.2f", lancamento.getValor()));
        if (isReceber) {
            saldo += lancamento.getValor();
            return;
        }
        saldo -= lancamento.getValor();
    }

    public void printSaldo() {
        System.out.println("Saldo = " + String.format("%.2f", saldo));
    }
}
