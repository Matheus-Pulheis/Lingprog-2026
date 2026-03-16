
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quantos termos da sequência de Fibonacci você quer ver? ");
        int termos = leitor.nextInt();
        int n1 = 0, n2 = 1;
        System.out.println("\nSequência de Fibonacci com " + termos + " termos:");
        for (int i = 1; i <= termos; i++) {
            System.out.print(n1 + " ");
            int proximo = n1 + n2;
            n1 = n2;               
            n2 = proximo;         
        }
        System.out.println("\n\nFim da sequência.");
    }
}