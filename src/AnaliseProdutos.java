import java.util.Scanner;

public class AnaliseProdutos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String produtoMaisCaro = "";
        double precoMaisCaro = 0;
        char continuar;
        do {
            System.out.print("Digite o nome do produto: ");
            String nome = leitor.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = leitor.nextDouble();
            leitor.nextLine();
            if (preco > precoMaisCaro) {
                precoMaisCaro = preco;
                produtoMaisCaro = nome;
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = leitor.next().toUpperCase().charAt(0);
            leitor.nextLine();

            System.out.println("---------------------------");

        } while (continuar == 'S');

        System.out.println("\nFim do programa!");
        if (!produtoMaisCaro.equals("")) {
            System.out.println("O produto mais caro foi: " + produtoMaisCaro);
            System.out.println("Preço: R$ " + precoMaisCaro);
        }
    }
}