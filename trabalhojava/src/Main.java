import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Scanner scanner = new Scanner(System.in);
        int escolha, valor;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - INSERIR");
            System.out.println("2 - BUSCAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - PERCURSO EM ORDEM");
            System.out.println("5 - SAIR");
            System.out.print("Selecione um valor: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                                                // Inserção de um novo valor
                    System.out.print("Digite um valor para inserir: ");
                    valor = scanner.nextInt();
                    arvore.inserir(valor);
                    System.out.println("Valor inserido!.");
                    break;
                case 2:
                                                // Busca de um valor
                    System.out.print("Digite um valor para buscar: ");
                    valor = scanner.nextInt();
                    boolean encontrado = arvore.buscar(valor);
                    System.out.println(encontrado ? "Valor encontrado." : "Valor nao encontrado.");
                    break;
                case 3:
                                                // Remoção de um valor
                    System.out.print("Digite um valor para remover: ");
                    valor = scanner.nextInt();
                    arvore.remover(valor);
                    System.out.println("Valor removido, se existente.");
                    break;
                case 4:
                                                // Percurso em Ordem
                    System.out.println("Percurso em Ordem:");
                    arvore.emOrdem();
                    System.out.println();  // Adiciona uma nova linha após o percurso
                    break;
                case 5:
                                                // Sair do programa
                    System.out.println("Saindo.");
                    break;
                default:
                                                // Opção inválida
                    System.out.println("Opção invalida. Tente novamente.");
                    break;
            }
        } while (escolha != 5);

        scanner.close();
        // Fecha o scanner
    }
}
