import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        float[] salarios = lerSalarios(5);
        float media = calcularMedia(salarios);
        exibirEstatisticas(salarios, media);
    }

    public static float[] lerSalarios(int qtd) {
        Scanner sc = new Scanner(System.in);
        float[] lista = new float[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o salario: ");
            lista[i] = sc.nextFloat();
        }
        return lista;
    }

    public static float calcularMedia(float[] salarios) {
        float soma = 0;
        for (float s : salarios) soma += s;
        return soma / salarios.length;
    }

    public static void exibirEstatisticas(float[] salarios, float media) {
        int acima = 0, abaixo = 0, igual = 0;

        for (float s : salarios) {
            if (s > media) acima++;
            else if (s < media) abaixo++;
            else igual++;
        }

        System.out.printf("%nA quantidade de funcionarios que ganham (Média: %.2f):%n", media);
        System.out.println("Acima: " + acima);
        System.out.println("Abaixo: " + abaixo);
        System.out.println("Igual: " + igual);
    }
}