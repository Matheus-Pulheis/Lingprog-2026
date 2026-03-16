import java.util.Scanner;

public class Tabuada {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite um numero: ");
			int num = sc.nextInt();
			for(int i=0; i<11;i++) {
				int resultado = num * i;
				System.out.print("["+num+"] x ["+ i +"] = "+ resultado + "\n");
			}
		}
}
