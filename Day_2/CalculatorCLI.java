import java.util.Scanner;

public class CalculatorCLI {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escolha o sinal da operação (+, -, *, /):");
            String operacao = teclado.nextLine();
            if (!(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/"))) {
                System.out.println("Opção inválida...");
                continue;
            } 

            int valorA;
            int valorB;
            try {
                System.out.println("Digite um número:");
                valorA = Integer.parseInt(teclado.nextLine());

                System.out.println("Digite outro número:");
                valorB = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Não é número, resposta inválida");
                continue;
            }
            
            if (operacao.equals("/") && valorB == 0) {
                System.out.println("Operação inválida, divisão por 0");
                continue;
            } else {
                resultadoOperacao(valorA, operacao, valorB);
            }

            System.out.println("[C] Continuar [Q] Sair");
            String escolha = teclado.nextLine();
            switch (escolha) {
                case "q", "Q" -> {teclado.close(); return;}
                case "c" -> {
                    System.out.println("Continuando...");
                }
                case "C" -> {
                    System.out.println("Continuando...");
                }
                default -> {
                    System.out.println("Opção inválida...");
                    continue;
                }

            }
        }
        while (true);
        
    }
    static void resultadoOperacao(int valorA, String operacao, int valorB) {
        switch (operacao) {
            case "+" -> System.out.println("O resultado da adição é: " + (valorA + valorB));
            case "-" -> System.out.println("O resultado da subtração é: " + (valorA - valorB));
            case "*" -> System.out.println("O resultado da multiplicação é: " + (valorA * valorB));
            case "/" -> System.out.println("O resultado da divisão é: " + (valorA / valorB));
        }
    }
}