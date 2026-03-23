import java.util.Scanner;

public class SistemaDeEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        String[] produtos = new String[5];
        int[] quantidades = new int[5];        
        System.out.println("--- Cadastro de Produtos e Estoque ---");
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Nome do " + (i + 1) + "º produto: ");
            produtos[i] = sc.next();             
            System.out.print("Quantidade em estoque de " + produtos[i] + ": ");
            quantidades[i] = sc.nextInt();
            System.out.println("------------------------------------");
        }        
        System.out.println("\n===== RELATÓRIO DE ESTOQUE CRÍTICO (Menos de 5 unidades) =====");
        boolean encontrouCritico = false;        
        for (int i = 0; i < quantidades.length; i++) {
            if (quantidades[i] < 5) {
                System.out.println("Produto: " + produtos[i] + " | Unidades: " + quantidades[i]);
                encontrouCritico = true;
            }
        }
        if (!encontrouCritico) {
            System.out.println("Todos os produtos estão com estoque em dia!");
        }       
        System.out.println("==============================================================");
    }
}