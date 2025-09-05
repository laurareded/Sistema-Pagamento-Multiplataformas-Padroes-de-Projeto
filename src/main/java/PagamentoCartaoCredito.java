public class PagamentoCartaoCredito implements Pagamento {

    @Override
    public String processarPagamento(double valor) {
        if (validarCartao("1234567812345678")) { 
            return "Pagamento de R$" + valor + " com Cartão de Crédito aprovado.";
        } else {
            return "Pagamento com Cartão de Crédito recusado: número de cartão inválido.";
        }
    }

    private boolean validarCartao(String numeroCartao) {
        // Deve validar se o número do cartão tem 16 dígitos. [cite: 143]
        return numeroCartao != null && numeroCartao.length() == 16;
    }
}
