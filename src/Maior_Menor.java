import java.util.Scanner;

public class Maior_Menor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int maior = 0;
		int PosMaior =0;
		int menor = 0;
		int PosMenor = 0;
		for(int i=0;i<numeros.length;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			if(i == 0) {
				maior = numeros[i];
				menor = numeros[i];
				PosMaior = i;
				PosMenor = i;
			}
			else {
				if(numeros[i] > maior) {
					maior = numeros[i];
					PosMaior = i;
				}
				else if(menor > numeros[i]) {
					menor = numeros[i];
					PosMenor = i;
				
				}
			}
			
		}
		
		System.out.print("-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		System.out.print("O maior valor digitado foi: " + maior);
		System.out.print("\nO menor valor digitado foi: " + menor);
		System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		System.out.print("A posição do maior é " + PosMaior);
		System.out.print("\nA posição do menor é " + PosMenor);
	}
}
