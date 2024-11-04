package scr.lib;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Classe principal
public class Fruta {
    public static void main(String[] args) {
        // Cria um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in); 
        // Cria uma lista para armazenar as frutas
        ArrayList<String> frutas = new ArrayList<>();

        // Loop principal do programa
        while (true) {
            try {
                // Exibe o menu de opções para o usuário
                System.out.println("Escolha uma opção:");
                System.out.println("1. Adicionar Fruta");
                System.out.println("2. Listar todas as Frutas");
                System.out.println("3. Modificar as Frutas");
                System.out.println("4. Sair");

                // Lê a opção escolhida pelo usuário
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha após o número

                // Executa uma ação com base na opção escolhida
                switch (opcao) {
                    case 1:
                        // Adiciona uma nova fruta
                        System.out.print("Digite o nome da fruta para adicionar: ");
                        String novaFruta = scanner.nextLine();
                        frutas.add(novaFruta);
                        System.out.println(novaFruta + " foi adicionada");
                        break;
                    case 2:
                        // Lista todas as frutas
                        System.out.println("Lista de frutas:");
                        for (String fruta : frutas) {
                            System.out.println(fruta);
                        }
                        break;
                    case 3:
                        // Modifica uma fruta existente
                        System.out.print("Digite o índice da fruta para modificar: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine(); // Consome a nova linha após o número

                        // Verifica se o índice é válido
                        if (indice >= 0 && indice < frutas.size()) {
                            System.out.print("Digite o novo nome da fruta: ");
                            String novaNomeFruta = scanner.nextLine();
                            frutas.set(indice, novaNomeFruta);
                            System.out.println("Fruta modificada com sucesso.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                        break;
                    case 4:
                        // Encerra o programa
                        System.out.println("Saindo...");
                        scanner.close();
                        return; // Sai do método main
                    default:
                        // Trata opções inválidas
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                // Trata entradas não numéricas para as opções
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine(); // Limpa a entrada inválida
            }
        }
    }
}
