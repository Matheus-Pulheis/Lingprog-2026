import java.util.Scanner;

public class SubstituicaoDeValores {
    public static void main(String[] args) {
        int[] numeros = lerNumeros(10);
        processarSubstituicao(numeros);
        exibirVetor(numeros);
    }

    public static int[] lerNumeros(int qtd) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        return vet;
    }

    public static void processarSubstituicao(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                vet[i] = 0;
            }
        }
    }

    public static void exibirVetor(int[] vet) {
        System.out.println("\nOs numeros negativos foram substituidos por [0]");
        for (int n : vet) {
            System.out.println(n);
        }
    }
}