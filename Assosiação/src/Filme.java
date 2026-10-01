package AssociacaoNN;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList<Atuacao> atuacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
        atuacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarAtuacao(Atuacao atuacao) {
        atuacoes.add(atuacao);
    }

    public void listarElenco() {
        System.out.println("Filme: " + titulo);
        for (Atuacao atuacao : atuacoes) {
            System.out.println(atuacao.getAtor().getNome() + " - " + atuacao.getPersonagem());
        }
    }
}
