import java.util.Scanner;

public class O_Buscador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[10];
		
		for(int i=0;i<nomes.length;i++) {
			System.out.print("Digite um nome: ");
			nomes[i] = sc.nextLine().toUpperCase();
		}
		
		System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-\n");
		System.out.print("Qual nome deseja Buscar? ");
		String nome = sc.nextLine().toUpperCase();
		
		for(int i=0;i<nomes.length;i++) {
			if(nomes[i].equals(nome)) {
				System.out.print("O nome foi encontrado!");
				System.out.print("\nPosição: " + i);
			}
		}
	}
}
