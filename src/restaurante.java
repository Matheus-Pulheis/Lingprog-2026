import java.util.Scanner;

public class restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto = "";
        double precoBase = 0.0;

        System.out.println("=== BEM-VINDO AO JAVA LANCHES ===");
        System.out.println("CÓDIGO | PRODUTO         | VALOR");
        System.out.println("101    | Cachorro Quente | R$ 10,00");
        System.out.println("102    | X-Burger        | R$ 15,00");
        System.out.println("103    | X-Salada        | R$ 12,00");
        System.out.print("\nDigite o código do produto desejado: "); 
        int codigo = scanner.nextInt();
        switch (codigo) {
            case 101:
                nomeProduto = "Cachorro Quente";
                precoBase = 10.00;
                break;
            case 102:
                nomeProduto = "X-Burger";
                precoBase = 15.00;
                break;
            case 103:
                nomeProduto = "X-Salada";
                precoBase = 12.00;
                break;
            default:
                System.out.println("Produto Inválido. Programa encerrado.");
                return;
        }
        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();
        double desconto = 0.0;
        String categoria = "";
        if (idade < 12) {
            desconto = 0.50;
            categoria = "Menu Kids (50% OFF)";
        } else if (idade <= 60) {
            desconto = 0.0; 
            categoria = "Valor Integral";
        } else {
            desconto = 0.30; 
            categoria = "Melhor Idade (30% OFF)";
        }
        double valorDesconto = precoBase * desconto;
        double valorFinal = precoBase - valorDesconto;
        System.out.println("\n--- RESUMO DO PEDIDO ---");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Categoria: " + categoria);
        System.out.printf("Preço original: R$ %.2f%n", precoBase);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
        System.out.println("-------------------------");
    }
}