package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Principal {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			List<Contribuintes> lista = new ArrayList<>();
			
			System.out.print("Enter the number of tax player: ");
			int num = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<num;i++) {
				System.out.print("Tax player #"+i+" data: ");
				System.out.print("Individual or company (i/c)?");
				char resp = sc.nextLine().charAt(0);
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				double rendaAnual = sc.nextDouble();
				if(resp == 'i') {
					System.out.print("Health expenditures: ");
					double gastosSaude = sc.nextDouble();
					sc.nextLine();
					lista.add(new PessoaFisica(name, rendaAnual, gastosSaude));
				}
				else if (resp == 'c') {
					System.out.print("Number of employees: ");
					int numFuncionarios = sc.nextInt();
					sc.nextLine();
					lista.add(new PessoaJuridica(name, rendaAnual, numFuncionarios));
				}
			}
			double soma = 0.0;
			System.out.println("TAXES PAID: ");
			for(Contribuintes c : lista) {
				System.out.println(c);
				soma += c.imposto();
			}
			
			System.out.print("TOTAL TAXES: $ "+ soma);
		}

}
