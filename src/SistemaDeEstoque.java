import java.util.Scanner;

public class SistemaDeEstoque {
    public static void main(String[] args) {
        String[] produtos = new String[5];
        int[] quantidades = new int[5];

        cadastrarProdutos(produtos, quantidades);
        gerarRelatorioCritico(produtos, quantidades);
    }

    public static void cadastrarProdutos(String[] nomes, int[] qtds) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cadastro de Produtos e Estoque ---");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do " + (i + 1) + "º produto: ");
            nomes[i] = sc.next();
            System.out.print("Quantidade em estoque de " + nomes[i] + ": ");
            qtds[i] = sc.nextInt();
            System.out.println("------------------------------------");
        }
    }

    public static void gerarRelatorioCritico(String[] nomes, int[] qtds) {
        System.out.println("\n===== RELATÓRIO DE ESTOQUE CRÍTICO (Menos de 5 unidades) =====");
        boolean encontrou = false;
        for (int i = 0; i < qtds.length; i++) {
            if (qtds[i] < 5) {
                System.out.printf("Produto: %s | Unidades: %d%n", nomes[i], qtds[i]);
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Todos os produtos estão com estoque em dia!");
        System.out.println("==============================================================");
    }
}