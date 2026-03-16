import java.util.Scanner;

public class RendimentoPoupanca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do depósito inicial: R$ ");
        double saldo = leitor.nextDouble();
        System.out.print("Digite a taxa de juros mensal (ex: 0,5): ");
        double taxa = leitor.nextDouble();
        System.out.println("\n--- Evolução do Saldo em 12 Meses ---");
        for (int mes = 1; mes <= 12; mes++) {
            double jurosDoMes = saldo * (taxa / 100);
            saldo = saldo + jurosDoMes;
            System.out.printf("Mês %d: R$ %.2f%n", mes, saldo);
        }

    }
}