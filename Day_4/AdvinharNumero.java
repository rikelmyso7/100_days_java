import java.util.Random;
import java.util.Scanner;

public class AdvinharNumero { // Complexidade O(n)
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) { // O(N)
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

    // generateSecret
    private static int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private static void verificarResultado(int tentativas, int numeroAleatorio, Scanner teclado) {
        while (tentativas > 0) { //O(N)
            System.out.printf("Você tem %d tentativa(s).%n", tentativas);
            int palpite = lerPalpite(teclado);

            if (palpite > numeroAleatorio) {
                System.out.println("Menor...");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Maior...");
            } else {
                System.out.println("Parabéns, você acertou!");
                return;
            }

            tentativas--;
        }

        System.out.println("Suas tentativas acabaram. O número era: " + numeroAleatorio);
    }

    // readGuess
    private static int lerPalpite(Scanner teclado) {
        while (true) { // O(N)
            System.out.print("Digite um número: ");
            try {
                return Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
            }
        }
    }
}
