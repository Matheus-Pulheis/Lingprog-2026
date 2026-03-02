import java.util.Scanner;

import entities.Conta;

import entities.Conta;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        int num = sc.nextInt();
        System.out.print("Digite o numero 2: ");
        int num2 = sc.nextInt();
        Conta conta = new Conta(num, num2);
        System.out.print("A soma é igual a " + conta.soma(num,num2));
    }
}