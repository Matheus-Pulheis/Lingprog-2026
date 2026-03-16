import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = leitor.nextInt();
        long fatorial = 1;
        System.out.print(numero + "! = ");
        for (int i = numero; i >= 1; i--) {
            fatorial *= i; 
            
            if (i > 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + fatorial);
    }
}