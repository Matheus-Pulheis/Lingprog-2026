package entities;

import java.util.ArrayList;
import java.util.List;

public class Conta {

			private String username;
			private String password;
			private List<String> minhaBiblioteca = new ArrayList<>();
			
			
			public Conta(String username, String password) {
				this.username = username;
				this.password = password;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}
			
			
			public void AdicionarLivro(String livro) {
				minhaBiblioteca.add(livro);
			}
			
			public List<String> getMinhaBiblioteca() {
		        return minhaBiblioteca;
		    }
			
			public void livroALugado(int livroAlugado) {
				 minhaBiblioteca.remove(livroAlugado);
			}
			
}
