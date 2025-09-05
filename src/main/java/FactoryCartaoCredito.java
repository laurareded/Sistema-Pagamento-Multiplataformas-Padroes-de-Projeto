public class FactoryCartaoCredito extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartaoCredito();
    }
}