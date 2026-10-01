package Agregacao;

public class TesteTime {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Lucas", 10);
        Jogador j2 = new Jogador("Pedro", 7);
        Jogador j3 = new Jogador("Carlos", 9);

        Time time = new Time("Fatec FC");
        time.adicionarJogador(j1);
        time.adicionarJogador(j2);
        time.adicionarJogador(j3);
        time.listarJogadores();
    }
}
