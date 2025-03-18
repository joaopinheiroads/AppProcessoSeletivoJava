import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); // Criando objeto Scanner

        System.out.println("Digite o primeiro número:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo número:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }

        terminal.close(); // Fechar o Scanner para evitar vazamento de recursos
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = 1; i <= (parametroDois - parametroUm); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
}
