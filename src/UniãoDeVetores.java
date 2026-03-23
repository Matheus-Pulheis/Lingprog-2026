import java.util.Scanner;

public class UniãoDeVetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vet1 = new int[5];
		int[] vet2 = new int[5];
		int[] vet3 = new int[10];
		
		System.out.print("Vetor 1:  \n");
		for(int i=0;i<vet1.length;i++) {
			System.out.print("Digite um numero: \n");
			vet1[i] = sc.nextInt();
		}
		System.out.print("Vetor 2:  ");
		for(int i=0;i<vet2.length;i++) {
			System.out.print("Digite um numero: \n");
			vet2[i] = sc.nextInt();
		}
		System.out.print("Vetor 3:  \n");
		for(int i=0;i<vet1.length;i++) {
			vet3[i] = vet1[i];
		}
		for(int i = 5; i < 10; i++) {
		    vet3[i] = vet2[i - 5];
		}
		for(int i=0;i<vet3.length;i++) {
			System.out.print(vet3[i] + "\n");
		}
		
	}
}
