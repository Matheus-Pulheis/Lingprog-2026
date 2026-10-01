package AssociacaoNN;

import java.util.ArrayList;

public class Ator {
    private String nome;
    private ArrayList<Atuacao> atuacoes;

    public Ator(String nome) {
        this.nome = nome;
        atuacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAtuacao(Atuacao atuacao) {
        atuacoes.add(atuacao);
    }
}
