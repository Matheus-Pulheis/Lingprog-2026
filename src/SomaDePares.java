import java.util.Scanner;

public class SomaDePares {
    public static void main(String[] args) {
        int[] numeros = lerNumeros(8);
        int somaPares = calcularSomaPares(numeros);
        System.out.println("A soma dos numeros pares é igual a " + somaPares);
    }

    public static int[] lerNumeros(int qtd) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um numero: ");
            lista[i] = sc.nextInt();
        }
        return lista;
    }

    public static int calcularSomaPares(int[] lista) {
        int soma = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                soma += num;
            }
        }
        return soma;
    }
}