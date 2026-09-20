public class programa {

    public static void main(String[] args) {
        int[] tamanhos = {100, 1000, 10000, 100000};
        String[] cenarios = {"Aleatorio", "Crescente", "Decrescente"};

    
        System.out.println("                         RESULTADO DOS TESTES DE DESEMPENHO (ms)                          ");
        System.out.printf("%-10s | %-12s | %-12s | %-14s | %-14s | %-10s\n", 
                          "Tamanho", "Cenario", "BubbleSort", "Selecao Direta", "Insercao Direta", "QuickSort");

        for (int i = 0; i < tamanhos.length; i++) {
            int tam = tamanhos[i];

            for (int j = 0; j < cenarios.length; j++) {
                String cenario = cenarios[j];

                int[] vetorBase = new int[tam];
                int[] vetorAux = new int[tam];

                if (cenario.equals("Aleatorio")) {
                    gerarAleatorio(vetorBase);
                } else if (cenario.equals("Crescente")) {
                    gerarCrescente(vetorBase);
                } else if (cenario.equals("Decrescente")) {
                    gerarDecrescente(vetorBase);
                }
         
                copiarVetor(vetorBase, vetorAux);
                long inicio = System.currentTimeMillis();
                if (tam <= 10000) {
                    bubbleSort(vetorAux);
                }
                long fim = System.currentTimeMillis();
                long tempoBubble = (tam > 10000) ? -1 : (fim - inicio);

       
                copiarVetor(vetorBase, vetorAux);
                inicio = System.currentTimeMillis();
                if (tam <= 10000) {
                    selecaoDireta(vetorAux);
                }
                fim = System.currentTimeMillis();
                long tempoSelecao = (tam > 10000) ? -1 : (fim - inicio);

                copiarVetor(vetorBase, vetorAux);
                inicio = System.currentTimeMillis();
                if (tam <= 10000 || cenario.equals("Crescente")) {
                    insercaoDireta(vetorAux);
                }
                fim = System.currentTimeMillis();
                long tempoInsercao = (tam > 10000 && !cenario.equals("Crescente")) ? -1 : (fim - inicio);

        
                copiarVetor(vetorBase, vetorAux);
                inicio = System.currentTimeMillis();
    
                if (tam < 100000 || cenario.equals("Aleatorio")) {
                    quickSort(vetorAux, 0, vetorAux.length - 1);
                }
                fim = System.currentTimeMillis();
                long tempoQuick = (tam == 100000 && !cenario.equals("Aleatorio")) ? -1 : (fim - inicio);

                String strBubble = (tempoBubble == -1) ? "Demorou +5m" : tempoBubble + " ms";
                String strSelecao = (tempoSelecao == -1) ? "Demorou +5m" : tempoSelecao + " ms";
                String strInsercao = (tempoInsercao == -1) ? "Demorou +5m" : tempoInsercao + " ms";
                String strQuick = (tempoQuick == -1) ? "Erro (Pilha)" : tempoQuick + " ms";

                System.out.printf("%-10d | %-12s | %-12s | %-14s | %-14s | %-10s\n", 
                                  tam, cenario, strBubble, strSelecao, strInsercao, strQuick);
            }
            System.out.println("------------------------------------------------------------------------------------------");
        }
    }

    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            boolean trocou = false;
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    trocou = true;
                }
            }
            if (!trocou) break; 
        }
    }

    public static void selecaoDireta(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
            int aux = v[menor];
            v[menor] = v[i];
            v[i] = aux;
        }
    }

    public static void insercaoDireta(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }

    public static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = particionar(v, inicio, fim);
            quickSort(v, inicio, pivoIndex - 1);
            quickSort(v, pivoIndex + 1, fim);
        }
    }

    public static int particionar(int[] v, int inicio, int fim) {
        int pivo = v[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (v[j] <= pivo) {
                i++;
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }
        int aux = v[i + 1];
        v[i + 1] = v[fim];
        v[fim] = aux;
        return i + 1;
    }

    public static void gerarAleatorio(int[] v) {
        int valor = 13;
        for (int i = 0; i < v.length; i++) {
            valor = (valor * 31 + 17) % 100000;
            v[i] = valor;
        }
    }

    public static void gerarCrescente(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }
    }

    public static void gerarDecrescente(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = v.length - i;
        }
    }

    public static void copiarVetor(int[] origem, int[] destino) {
        for (int i = 0; i < origem.length; i++) {
            destino[i] = origem[i];
        }
    }
}