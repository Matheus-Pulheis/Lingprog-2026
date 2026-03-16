import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);    
        int idade = 0;
        int somaIdades = 0;
        int contadorAlunos = 0;
        System.out.println("Digite as idades (digite um número negativo para sair):");
        while (true) {
            System.out.print("Idade: ");
            idade = leitor.nextInt();
            if (idade < 0) {
                break;
            }

            somaIdades += idade;
            contadorAlunos++;    
        }

        if (contadorAlunos > 0) {
            double media = (double) somaIdades / contadorAlunos;
            System.out.println("\nQuantidade de alunos: " + contadorAlunos);
            System.out.println("Média das idades: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi digitada.");
        }
    }
}