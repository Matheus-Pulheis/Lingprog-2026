import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        int[] num = lerNumeros(5);
        ordenarVetor(num);
        exibirVetor(num);
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

    public static void ordenarVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[i] < vet[j]) {
                    trocar(vet, i, j);
                }
            }
        }
    }

    private static void trocar(int[] vet, int i, int j) {
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }

    public static void exibirVetor(int[] vet) {
        System.out.println("\n-=-=-=-=-=-=-= Vetor alinhado -=-=-=-==-=-=-=");
        for (int n : vet) {
            System.out.println(n);
        }
    }
}