import java.util.Scanner;

public class Armazenamento_Nomes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[5];
		
		for(int i = 0;i<5;i++) {
		System.out.print("Digite um nome: ");
		nomes[i] = sc.nextLine();
		}
		
		System.out.print("-=-=-=-=-=-=-=-=-=-=-\n");
		for(int i=0;i<nomes.length;i++) {
			System.out.print("\nNOME: " + nomes[i]);
		}
	}
}
