import java.util.Random;
import java.util.Scanner;

public class AdvinharNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) { 
            int tentativas = 7;
            int numeroAleatorio = gerarNumeroAleatorio();
            
            System.out.println("Advinhe o número entre 0 e 100:");
            verificarResultado(tentativas, numeroAleatorio, teclado);
            
            System.out.println("[C] Continuar | [Q] Sair");
            String escolha = teclado.nextLine();

             switch (escolha) {
                case "q", "Q" -> {teclado.close(); return;}
                case "c", "C" -> {
                    System.out.println("Continuando...");
                }
                default -> {
                    System.out.println("Opção inválida...");
                    return;
                }
            }
        }
    }

    private static int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private static void verificarResultado(int tentativas, int numeroAleatorio, Scanner teclado) {
        while (tentativas > 0) {
            System.out.printf("Você tem %d tentativa(s). Digite um número: ", tentativas);
            int resposta;

            try {
                resposta = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
                continue;
            }
            
            if (resposta != numeroAleatorio) {
                tentativas--;
                System.err.println("Resposta errada");
                if (tentativas == 0) {
                    System.out.println("Suas tentativas acabaram. O número era: " + numeroAleatorio);
                    return;
                }
            } else {
                System.err.println("Parabéns, você conseguiu!");
                return;
            }
        }
    }
}
