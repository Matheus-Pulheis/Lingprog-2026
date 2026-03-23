import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		 int aux = 0;
 		for(int i=0;i<num.length;i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		
 		for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num.length; j++) {
                if(num[i] < num[j]) {
                    aux = num[i];   
                    num[i] = num[j]; 
                    num[j] = aux; 
                }
            }
        }
		
		System.out.print("\n-=-=-=-=-=-=-= Vetor alinhado -=-=-=-==-=-=-=\n");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i] + "\n");
		}
		
	}
}
