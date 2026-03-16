import java.util.Scanner;

public class IntervaloPares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o limite inferior: ");
        int inferior = leitor.nextInt();
        System.out.print("Digite o limite superior: ");
        int superior = leitor.nextInt();
        System.out.println("Números pares no intervalo entre " + inferior + " e " + superior + ":");
        for (int i = inferior; i <= superior; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}