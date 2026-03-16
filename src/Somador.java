import java.util.Scanner;

public class Somador {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite quantos numeros deseja somar: ");
			int num = sc.nextInt();
			float result = 0;
			for(int i = 0;i<num;i++) {
				System.out.print("Digite o numero: ");
				float n = sc.nextFloat();
				result += n;
			}
			System.out.print("A soma dos numero é " + result);
		}
}
