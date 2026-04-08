import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;
public class Application {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Cliente
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth data (DD/MM/YYYY): ");
		String brithdatastr = sc.nextLine();
		Date birthDate = sdf.parse(brithdatastr);
		Client client = new Client(name, email, birthDate);
		//Order
		System.out.println("Enter order data: ");
		System.out.print("STATUS: ");
		String sts = sc.nextLine();
		OrderStatus stats = OrderStatus.valueOf(sts);
		LocalDateTime moment = LocalDateTime.now();
		Order status = new Order(moment, stats, client);
	
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		//product
		for(int i=0;i<n;i++) {
			System.out.println("ENTER  #" + (i+1) + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product Price: ");
			float productPrice = sc.nextFloat();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(quantity, (double)productPrice, product);
			status.addItem(item);
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + status.getMoment());
		System.out.println("Order statud: " + status.getStatus());
		System.out.println(client);
		System.out.println("Order Items: ");
		System.out.println(status.toString());
		System.out.println("TOTAL: " + status.total());
	}
}
