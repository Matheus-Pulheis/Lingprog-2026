package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> produtos = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<num;i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i):");
			char resp = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.print("");
			if(resp == 'i') {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				sc.nextLine();
				Product produto = new ImportedProduct(name, price, fee);
				produtos.add(produto);
			}
			else if(resp == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dt = sc.nextLine();
				LocalDate data = LocalDate.parse(dt, formatter);
				Product produto = new UsedProduct(name, price, data);
				produtos.add(produto);
			}
			else if(resp == 'c' ){
				Product produto = new Product(name, price);
				produtos.add(produto);
			}
		}
		System.out.println("");
		System.out.println("PRICE TAGS: ");
		for(Product p : produtos) {
			System.out.println(p.priceTag());
		}
	}
}
