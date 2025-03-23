import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== iPhone Simulator ===");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador Internet");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    menuReprodutorMusical(iphone, scanner);
                    break;
                case 2:
                    menuTelefone(iphone, scanner);
                    break;
                case 3:
                    menuNavegador(iphone, scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o simulador...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }

    private static void menuReprodutorMusical(IPhone iphone, Scanner scanner) {
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n=== Reprodutor Musical ===");
            System.out.println("1. Selecionar Música");
            System.out.println("2. Tocar");
            System.out.println("3. Pausar");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    iphone.selecionarMusica(musica);
                    break;
                case 2:
                    iphone.tocar();
                    break;
                case 3:
                    iphone.pausar();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuTelefone(IPhone iphone, Scanner scanner) {
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n=== Aparelho Telefônico ===");
            System.out.println("1. Fazer Ligação");
            System.out.println("2. Atender");
            System.out.println("3. Correio de Voz");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número: ");
                    String numero = scanner.nextLine();
                    iphone.ligar(numero);
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuNavegador(IPhone iphone, Scanner scanner) {
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n=== Navegador Internet ===");
            System.out.println("1. Exibir Página");
            System.out.println("2. Nova Aba");
            System.out.println("3. Atualizar Página");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case 2:
                    iphone.adicionarNovaAba();
                    break;
                case 3:
                    iphone.atualizarPagina();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}