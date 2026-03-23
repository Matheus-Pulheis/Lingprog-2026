import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float[] salario = new float[5];
		int soma =0;
		int Acima =0;
		int abaixo =0;
		int igual = 0;
		for(int i=0;i<salario.length;i++) {
			System.out.print("Digite o salario: ");
			salario[i] = sc.nextFloat();
			soma += salario[i];
		}
		float media = soma/5;
			for(int i=0;i<salario.length;i++) {
				if(salario[i] > media) {
					Acima++;
				}
				else if(salario[i] < media){
					abaixo++;
				}
				else{
					igual++;
				}
			}
		System.out.print("A quatidade de funcionarios que ganham: \n");
		System.out.print("Acima: " + Acima);
		System.out.print("\nAbaixo: " + abaixo);
		System.out.print("\nigual: " + igual);
	}
}
