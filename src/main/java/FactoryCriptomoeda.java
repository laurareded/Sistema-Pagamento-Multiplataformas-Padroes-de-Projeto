public class FactoryCriptomoeda extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCriptomoeda();
    }
}
