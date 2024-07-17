import java.util.Scanner;

public class Main {
    private static final String API_KEY = "632771de443f8c7fc126d96b";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor(API_KEY);
        Menu menu = new Menu(conversor);

        try {
            while (true) {
                menu.exibirMenu();
                int opcode = Integer.parseInt(scanner.nextLine());
                if (opcode == 0) {
                    System.out.println("Aguarde...");
                    return;
                }
                menu.processarOpcao(opcode);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
