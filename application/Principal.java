package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listaFuncionarios = new ArrayList<>();
		
		System.out.print("Enter the number of Employee: ");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<num;i++) {
		System.out.println("Employee #" + i + " data:");
		System.out.print("OutSourced [y/n]? ");
		char out = sc.nextLine().charAt(0);
		if(out == 'y') {
			System.out.print("name: ");
			String name = sc.nextLine();
			System.out.print("Hour: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("additional charge: ");
			double add = sc.nextDouble();
			sc.nextLine();
			Employee outfuncionario = new OutsourcedEmployee(name, hour, valuePerHour, add);
			listaFuncionarios.add(outfuncionario);
		}
		else {
			System.out.print("name: ");
			String name = sc.nextLine();
			System.out.print("Hour: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();
			Employee funcionario = new Employee(name, hour, valuePerHour);
			listaFuncionarios.add(funcionario);
		}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : listaFuncionarios) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
		
	}
}
