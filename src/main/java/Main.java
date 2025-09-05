public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService(); 

        System.out.println("--- Iniciando simulação de pagamentos ---");

        System.out.print("Tentando pagar com Cartão de Crédito... ");
        service.processarPagamento(new FactoryCartaoCredito(), 150.00); 

        System.out.print("Tentando pagar com PayPal... ");
        service.processarPagamento(new FactoryPayPal(), 75.50); 

        System.out.print("Tentando pagar com Criptomoeda (valor alto)... ");
        service.processarPagamento(new FactoryCriptomoeda(), 600.00);

        System.out.print("Tentando pagar com Criptomoeda (valor baixo)... ");
        service.processarPagamento(new FactoryCriptomoeda(), 300.00); 

        System.out.println("\n--- Demonstração da Extensibilidade ---");
        System.out.print("Tentando pagar com o novo método Apple Pay... ");
        service.processarPagamento(new FactoryApplePay(), 120.00);
    }
}