public class Menu {
    private final Conversor conversor;

    public Menu(Conversor conversor) {
        this.conversor = conversor;
    }

    public void exibirMenu() {
        System.out.println("=== Conversor de Moedas $$$ ===");
        System.out.println("1. (Real)    BRL  ---->   (Dólar)  USD");
        System.out.println("2. (Dólar)   USD  ---->   (Real)   BRL");
        System.out.println("3. (Real)    BRL  ---->   (Euro)   EUR");
        System.out.println("4. (Euro)    EUR  ---->   (Real)   BRL");
        System.out.println("5. (Dólar)   USD  ---->   (Euro)   EUR");
        System.out.println("6. (Euro)    EUR  ---->   (Dólar)  USD");
        System.out.println("0. Finalizar");
        System.out.println("Escolha a opção desejada: ");
    }

    public void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                conversor.converterMoeda("BRL", "USD");
                break;
            case 2:
                conversor.converterMoeda("USD", "BRL");
                break;
            case 3:
                conversor.converterMoeda("BRL", "EUR");
                break;
            case 4:
                conversor.converterMoeda("EUR", "BRL");
                break;
            case 5:
                conversor.converterMoeda("USD", "EUR");
                break;
            case 6:
                conversor.converterMoeda("EUR", "USD");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
