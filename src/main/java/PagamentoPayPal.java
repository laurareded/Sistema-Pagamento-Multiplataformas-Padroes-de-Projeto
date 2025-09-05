public class PagamentoPayPal implements Pagamento {

    @Override
    public String processarPagamento(double valor) {
        if (validarContaPayPal("laura@email.com")) { 
            return "Pagamento de R$" + valor + " com PayPal aprovado.";
        } else {
            return "Pagamento com PayPal recusado: e-mail não vinculado.";
        }
    }

    private boolean validarContaPayPal(String email) {
        return email != null && email.contains("@");
    }
}
