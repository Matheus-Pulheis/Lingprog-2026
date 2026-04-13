import java.util.Scanner;

public class O_Buscador {
    public static void main(String[] args) {
        String[] nomes = preencherNomes(10);
        String alvo = pedirNomeBusca();
        buscarExibir(nomes, alvo);
    }

    public static String[] preencherNomes(int qtd) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine().toUpperCase();
        }
        return nomes;
    }

    public static String pedirNomeBusca() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-\nQual nome deseja Buscar? ");
        return sc.nextLine().toUpperCase();
    }

    public static void buscarExibir(String[] lista, String alvo) {
        boolean encontrado = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(alvo)) {
                System.out.printf("O nome foi encontrado!%nPosição: %d%n", i);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Nome não encontrado.");
    }
}