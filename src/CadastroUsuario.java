import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            usuario = leitor.nextLine();

            System.out.print("Digite a senha: ");
            senha = leitor.nextLine();
            if (senha.equals(usuario)) {
                System.out.println("ERRO: A senha não pode ser igual ao nome de usuário! Tente novamente.\n");
            }

        } while (senha.equals(usuario));
        System.out.println("Cadastro realizado com sucesso!");

    }
}