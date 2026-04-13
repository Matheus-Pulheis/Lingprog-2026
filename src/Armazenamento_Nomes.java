import java.util.Scanner;

public class Armazenamento_Nomes {
    public static void main(String[] args) {
        String[] nomes = lerNomes(5);
        exibirNomes(nomes);
    }

    public static String[] lerNomes(int quantidade) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }
        return nomes;
    }

    public static void exibirNomes(String[] nomes) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        for (String nome : nomes) {
            System.out.println("NOME: " + nome);
        }
    }
}