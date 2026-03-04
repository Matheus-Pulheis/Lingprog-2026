package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Principal {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			int cont = 0;
			String user = "matheus";
			String password = "12345";
			
			List<String> Biblioteca = new ArrayList<>();
			Biblioteca.add("Dom Quixote"); Biblioteca.add("O Pequeno Príncipe"); Biblioteca.add("Harry Potter e a Pedra Filosofal"); 
			Biblioteca.add("O Senhor dos Anéis "); Biblioteca.add("1984"); Biblioteca.add("Cem Anos de Solidão"); Biblioteca.add("Orgulho e Preconceito"); 
			Biblioteca.add("Crime e Castigo"); Biblioteca.add("O Diário de Anne Frank "); Biblioteca.add("A Metamorfose");
			
			Conta Conta = new Conta(user, password);
			System.out.print("-=-=-=- Conta -=-=-=-=-\n");
			System.out.print("[1] Criar");
			System.out.print("\n[2] Entrar\n");
			int resp = sc.nextInt();
			sc.nextLine();
			if (resp == 1) {
				System.out.print("\nUsername: ");
				user = sc.nextLine();
				System.out.print("\npassword: ");
				password = sc.nextLine();
				Conta = new Conta(user, password);
			}
			else if (resp == 2) {
				do {
				System.out.print("Username: ");
				user = sc.nextLine();
				System.out.print("password: ");
				password = sc.nextLine();
				if (user.equals(Conta.getUsername()) &&  password.equals(Conta.getPassword())) {
					System.out.print("\n=-=-=-=-=-=-=-=-=-=\n");
					System.out.print("Success!!");
					cont++;
				}
				else {
					System.out.print("\n=-=-=-=-=-=-=-=-=-=\n");
					System.out.print("ERROR! Try again");
					System.out.print("\n=-=-=-=-=-=-=-=-=-=\n");
				}
				} while (cont != 1);
			}
			int resposta;
			do {
			System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			System.out.print("Profile: " + Conta.getUsername());
			System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			System.out.print("[1] Minha biblioteca\n");
			System.out.print("[2] Listar Livros Disponíveis\n");
			System.out.print("[3] Alugar Livro\n");
			System.out.print("[4] Sair\n");
			resposta = sc.nextInt();
			if (resposta == 1) {
				System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
				System.out.print("MINHA BIBLIOTECA\n");
				System.out.print(Conta.getMinhaBiblioteca());
			}
			else if(resposta == 2) {
				System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
				System.out.print("LIVROS DISPONÍVEIS\n");
				for(String x : Biblioteca) {
				System.out.print("[" + Biblioteca.indexOf(x) + "]"+ "- " + x + "\n");
				}
			}
			else if(resposta == 3) {
				System.out.print("Digite o numero do livro: ");
				int livroAlugado = sc.nextInt();
				sc.nextLine();
				if (livroAlugado >= 0) {
					System.out.print("Deseja alugar esse livro?");
					System.out.print("  [SIM]       [Não]");
					String confirm = sc.nextLine().toUpperCase();
					if ("SIM".equals(confirm)) {
						String livro = Biblioteca.get(livroAlugado);
						Biblioteca.set(livroAlugado, "LIVRO ALUGADO");
						Conta.AdicionarLivro(livro);
						System.out.print("Livro alugado!");
					}
					else {
						System.out.print("OK");
					}
				}
				
			}
			} while(resposta != 4);
			
		}
}
