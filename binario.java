import java.util.Arrays;
import java.util.Random;


public class binario {
    public static void main(String[] args){
        int[] vet = new int[100000];

        Random random = new Random();
        for (int i=0;i<vet.length;i++){
            vet[i] = random.nextInt(100000);
        }
        Arrays.sort(vet);
        int Binaria = BuscaBinaria(vet, 10);
        int Sequencial = buscasequencial(vet,10);

        System.out.println("Busca Sequencial - Índice: " + Sequencial);
        System.out.println("Busca Binária - Índice: " + Binaria);
    }

        public static int buscasequencial (int[] vet, int alvo) {
            for (int i = 0; i < vet.length; i++) {
                if (vet[i] == alvo) {
                    return i;
                }
            }
            return -1;
        }

        public static int BuscaBinaria(int[] vet, int alvo){
        int inicio = 0;
        int fim = vet.length -1;

        while(inicio <= fim){
            int meio = inicio + (fim - inicio) / 2;
            if (vet[meio] == alvo){
                return meio;
            }
            if(vet[meio] < alvo){
                inicio = meio + 1;
            }
            else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
