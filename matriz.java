import javax.xml.transform.Source;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Float[][] matriz = new Float[3][4];
        float soma = 0;
        int x = 0;
        float aluno1 = 0;
        float aluno2 = 0;
        float aluno3 = 0;
        for(int i=0;i<matriz.length;i++){
            x++;
            System.out.println("Aluno " + x);
            for(int j=0;j<matriz[1].length;j++){
                do{
                    System.out.println("Digite a nota de cada prova: ");
                    matriz[i][j] = sc.nextFloat();
                    if (matriz[i][j] > 10 || matriz[i][j] < 0){
                        System.out.println("Numero invalido!");
                    }
                } while(matriz[i][j] <0 || matriz[i][j ]>10);
                soma += matriz[i][j];
            }
        }
        float media = soma/12;


        for(int i =0;i<matriz.length;i++){
            for(int j=0;j<matriz[1].length;j++){
                if (i == 0){
                    aluno1 += matriz[i][j];
                }
                else if(i == 1){
                    aluno2 += matriz[i][j];
                }
                else{
                    aluno3 += matriz[i][j];
                }

            }
        }

        System.out.printf("A media da turma é igual a %.2f", media);
        System.out.printf("\nA media do aluno 1 é igual a %.2f", aluno1 / 4);
        System.out.printf("\nA media do aluno 2 é igual a %.2f", aluno2 / 4);
        System.out.printf("\nA media do aluno 3 é igual a %.2f", aluno3 / 4);
    }
}
