import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de vezes que vc quer jogar o dado: ");
        int quantidade = sc.nextInt();
        int aposta = 0;
        System.out.println("Qual numero vc quer encontrar? ");
        aposta = sc.nextInt();
        while (aposta < 1 || aposta > 6) {
            System.out.println("Número inválido, tente novamente");
            aposta = sc.nextInt();
        }
        int acertos = 0;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-===");
        for (int i = 0; i < quantidade; i++) {
            float num = (float) (Math.random() * 6);
            System.out.println("O numero que o computador sorteou foi " + (int) num);
            if (aposta == (int) num) {
                acertos++;
            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-===");
        System.out.println("A quantidade de vezes que voce acertou é igual a " + acertos);
        System.out.println("A porcentagem de acerto foi de % "+ (acertos * 100)/quantidade);
    }
}