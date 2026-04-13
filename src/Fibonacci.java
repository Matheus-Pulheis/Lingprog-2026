import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int quantidade = pedirQuantidade();
        int[] sequencia = gerarFibonacci(quantidade);
        exibirSequencia(sequencia);
    }

    public static int pedirQuantidade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos numeros vc quer ver da sequencia: ");
        return sc.nextInt();
    }

    public static int[] gerarFibonacci(int n) {
        if (n <= 0) return new int[0];
        int[] fib = new int[n];
        
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static void exibirSequencia(int[] array) {
        System.out.println("\nSequencia de Fibonacci:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}