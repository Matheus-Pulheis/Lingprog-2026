import java.util.Scanner;

public class ValidacaoNota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota;

        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = leitor.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente.");
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = leitor.nextDouble();
        }

        System.out.println("Sucesso! Você digitou a nota: " + nota);
        
    }
}