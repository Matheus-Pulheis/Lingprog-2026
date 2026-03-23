import java.util.Scanner;

public class SubstituiçãoDeValores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			if(numeros[i] < 0) {
				numeros[i] = 0;
			}
		}
		System.out.print("\nOs numeros negativos foram substituidos por [0]\n");
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i] + "\n");
		}
		
	}
}
