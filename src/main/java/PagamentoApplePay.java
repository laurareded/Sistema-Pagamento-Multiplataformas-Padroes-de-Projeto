public class PagamentoApplePay implements Pagamento {
    @Override
    public String processarPagamento(double valor) {
        return "Pagamento de R$" + valor + " com Apple Pay aprovado via Face ID.";
    }
}