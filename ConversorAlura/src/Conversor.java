import java.util.Scanner;

public class Conversor {
    private final Cotacao Cotacao;

    public Conversor(String apiKey) {
        this.Cotacao = new Cotacao(apiKey);
    }

    public void converterMoeda(String moedaDe, String moedaPara) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor em " + moedaDe + ": ");
            double valor = Double.parseDouble(scanner.nextLine());

            double taxa = Cotacao.obterTaxaDeCambio(moedaDe, moedaPara);
            double resultado = valor * taxa;
            System.out.println("Valor em " + moedaPara + ": " + resultado + "\n");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
