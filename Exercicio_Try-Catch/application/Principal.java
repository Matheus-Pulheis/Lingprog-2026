package application;

import java.util.Scanner;

import Exeções.DomainException;
import entities.Account;

public class Principal {
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println("Enter account data: ");
				System.out.print("Number: ");
				int number = sc.nextInt();
				sc.nextLine();
				System.out.print("Holder: ");
				String holder = sc.nextLine();
				System.out.print("Initial balance: ");
				double balance = sc.nextDouble();
				System.out.print("WithDraw Limit: ");
				double withdrawlimit = sc.nextDouble();
				Account conta = new Account( number, holder, balance, withdrawlimit);
				System.out.println("");
				System.out.print("Enter amount for withdraw: ");
				double withdraw = sc.nextDouble();
				conta.withDraw(withdraw);

				System.out.print("New balance: " + conta.getBalance());
			}
			catch(DomainException e) {
				System.out.print("Withdraw error: " + e.getMessage());
				}
		}
}

