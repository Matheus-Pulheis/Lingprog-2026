package principal;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operacaoDesejada = ' ';

        while (operacaoDesejada != 's') {
            System.out.println("\n-=-=-=-=-=-=-=-=-=-  CALCULADORA   =-==-=-=-=-=-=-=-=-=-");
            System.out.println("Tabela de operações:");
            System.out.println("[+] - Adição");
            System.out.println("[-] - Subtração");
            System.out.println("[*] - Multiplicação");
            System.out.println("[/] - Divisão");
            System.out.println("[^] - Potenciação");
            System.out.println("[s] - Sair");
            System.out.print("Escolha a operação: ");        
            operacaoDesejada = sc.next().toLowerCase().charAt(0);

            if (operacaoDesejada == 's') {
                System.out.println("Encerrando... Até logo!");
                break;
            }

            System.out.print("Digite o 1° numero: ");
            float num1 = sc.nextFloat();
            System.out.print("Digite o 2° numero: ");
            float num2 = sc.nextFloat();

            float resultado = 0;
            boolean operacaoValida = true;

            switch (operacaoDesejada) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        operacaoValida = false;
                    }
                    break;
                case '^':
                    resultado = (float) Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Operação Inválida!");
                    operacaoValida = false;
                    break;
            }

            if (operacaoValida) {
                System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Resultado: [" + num1 + "] " + operacaoDesejada + " [" + num2 + "] = " + resultado);
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }
        sc.close();
    }
}