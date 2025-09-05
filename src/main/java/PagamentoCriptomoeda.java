public class PagamentoCriptomoeda implements Pagamento {

    @Override
    public String processarPagamento(double valor) {
        double saldoCarteira = 500.00; 
        if (verificarSaldo(saldoCarteira, valor)) {
            return "Pagamento de R$" + valor + " com Criptomoedas aprovado.";
        } else {
            return "Pagamento com Criptomoedas recusado: saldo insuficiente.";
        }
    }

    private boolean verificarSaldo(double saldo, double valorTransacao) {
        return saldo >= valorTransacao;
    }
}