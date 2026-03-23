import java.util.Scanner;

public class SomaDePares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[8];
		int soma = 0;
		for(int i=0;i<8;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			if(numeros[i] % 2 == 0) {
				soma += numeros[i];
			}
		}
		System.out.print("A soma dos numeros pares é igual a " + soma);
		
	}
}
