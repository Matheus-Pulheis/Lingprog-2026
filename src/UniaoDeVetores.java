import java.util.Scanner;

public class UniaoDeVetores {
    public static void main(String[] args) {
        int[] vet1 = lerVetor(5, "Vetor 1");
        int[] vet2 = lerVetor(5, "Vetor 2");
        
        int[] vet3 = unirVetores(vet1, vet2);
        
        exibirVetor(vet3, "Vetor 3 (União)");
    }

    public static int[] lerVetor(int tamanho, String nome) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[tamanho];
        System.out.println("\n--- " + nome + " ---");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        return vet;
    }

    public static int[] unirVetores(int[] v1, int[] v2) {
        int[] v3 = new int[v1.length + v2.length];
        
        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i];
        }
        
        for (int i = 0; i < v2.length; i++) {
            v3[i + v1.length] = v2[i];
        }
        
        return v3;
    }

    public static void exibirVetor(int[] vet, String titulo) {
        System.out.println("\n--- " + titulo + " ---");
        for (int num : vet) {
            System.out.println(num);
        }
    }
}