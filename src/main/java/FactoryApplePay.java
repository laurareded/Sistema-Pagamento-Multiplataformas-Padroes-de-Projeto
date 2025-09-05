public class FactoryApplePay extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoApplePay();
    }
}
