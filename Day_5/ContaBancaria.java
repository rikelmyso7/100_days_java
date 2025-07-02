
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long saldoBancario = 2000;
        int numeroConta = 1234;
        String titularConta = "Rikelmy";

        while (true) { 
            System.out.printf("Seja Bem Vindo Sr.%s! Selecione uma opção:\n", titularConta);
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Ver Saldo");
            System.out.print("Escolha (1, 2, 3): ");
            int escolha = Integer.parseInt(teclado.nextLine());
            switch (escolha) {
                case 1 -> saldoBancario = sacarConta(numeroConta, titularConta, saldoBancario, teclado);
                case 2 -> saldoBancario = depositarConta(numeroConta, titularConta, saldoBancario, teclado);
                case 3 -> verSaldo(numeroConta, titularConta, saldoBancario, teclado);
                default -> { System.out.println("Opção inválida...");
                    continue;
                }
            }
        }
    }

    private static long depositarConta(int numeroConta, String titularConta, long saldoBancario, Scanner teclado) {
        while (true) { 
            System.out.println("Deseja fazer um depósito em conta agora? (1 - SIM | 2 - NÃO)");
        int depositar = Integer.parseInt(teclado.nextLine());
        switch (depositar) {
                case 1 -> {
                    System.out.println("Continuando...");

                    System.out.println("Digite o Número da conta:");
                    int id = Integer.parseInt(teclado.nextLine());
                    if (numeroConta == id) {
                        System.out.println("Digite o nome do Titular da conta:");
                        String titular = teclado.nextLine();
                        if (titularConta.equalsIgnoreCase(titular)) {
                            System.out.printf("Bem vindo de volta %s, Digite o valor do depósito (Centavos indisponiveis): R$ ", titularConta);
                            try {
                                int depositoConta = Integer.parseInt(teclado.nextLine());
                                long longDepositoConta = (long) depositoConta;
                                System.out.printf("Depósito no valor de R$ %s,00 realizado com sucesso!", longDepositoConta);
                                return saldoBancario += longDepositoConta;
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inválido. Digite um número inteiro.");
                                continue;
                            }
                        }
                    } else {
                        System.out.println("Voltando ao Início...");
                    }
                }
                case 2 -> {
                    System.out.println("Voltando ao Início...");
                    return saldoBancario;
                }
                default -> {
                    System.out.println("Opção inválida...");
                }
            }

        
        }
    }

    private static long sacarConta(int numeroConta, String titularConta, long saldoBancario, Scanner teclado) {
         while (true) { 
            System.out.println("Deseja realizar um saque? (1 - SIM | 2 - NÃO)");
        int sacar = Integer.parseInt(teclado.nextLine());
        switch (sacar) {
                case 1 -> {
                    System.out.println("Continuando...");
                    System.out.println("Digite o Número da conta:");
                    int id = Integer.parseInt(teclado.nextLine());
                    if (numeroConta == id) {
                        System.out.println("Digite o nome do Titular da conta:");
                        String titular = teclado.nextLine();
                        if (titularConta.equalsIgnoreCase(titular)) {
                            System.out.printf("Bem vindo de volta %s, Digite o valor do saque (Centavos indisponiveis): R$ ", titularConta);
                            try {
                                int sacarConta = Integer.parseInt(teclado.nextLine());
                                if (saldoBancario > sacarConta) {
                                    long longSacarConta = (long) sacarConta;
                                    System.out.printf("Saque no valor de R$ %s,00 realizado com sucesso!\n", longSacarConta);
                                    return saldoBancario - longSacarConta;
                                } else {
                                    System.out.println("Saldo Indisponivel. Consulte o seu extrato");
                                    return saldoBancario;
                                }
                                
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inválido. Digite um número inteiro.");
                            }
                        }
                    } else {
                        System.out.println("Voltando ao Início...");
                    }
                }
                case 2 -> {
                    System.out.println("Voltando ao Início...");
                    return saldoBancario;
                }
                default -> {
                    System.out.println("Opção inválida...");
                }
            }

        
        }
    
    }

    private static void verSaldo(int numeroConta, String titularContaString, long saldoBancario, Scanner teclado) {
        System.out.printf("Conta: %d | Titular: Sr.%s | Saldo: R$ %d,00\n", numeroConta, titularContaString, saldoBancario);
    }
}
