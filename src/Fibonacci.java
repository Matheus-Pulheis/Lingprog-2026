import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite quantos numeros vc quer ver da sequencia de Fibonacci: ");
		int j = sc.nextInt();
		int[] Fibonacci = new int[j];
		Fibonacci[0] = 0;
		Fibonacci[1] = 1;
		Fibonacci[2] = 1;
		int soma = 0;
		for(int i=3;i<Fibonacci.length;i++) {
			soma = Fibonacci[i-2] + Fibonacci[i-1];
			Fibonacci[i] = soma;
		}
		
		System.out.print("\nSequencia de Fibonacci: \n");
		for(int i=0;i<Fibonacci.length;i++) {
			System.out.print(Fibonacci[i] + "\n");
		}
	}
}
