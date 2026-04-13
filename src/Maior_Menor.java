import java.util.Scanner;

public class Maior_Menor {
    public static void main(String[] args) {
        int[] numeros = lerNumeros(10);
        analisarExibir(numeros);
    }

    public static int[] lerNumeros(int qtd) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um numero: ");
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    public static void analisarExibir(int[] nums) {
        int maior = nums[0], menor = nums[0];
        int posMaior = 0, posMenor = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maior) {
                maior = nums[i];
                posMaior = i;
            } else if (nums[i] < menor) {
                menor = nums[i];
                posMenor = i;
            }
        }

        System.out.printf("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.printf("Maior: %d (Posição %d)\n", maior, posMaior);
        System.out.printf("Menor: %d (Posição %d)\n", menor, posMenor);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}