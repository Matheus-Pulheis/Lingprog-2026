package AssociacaoNN;

public class Atuacao {
    private Ator ator;
    private Filme filme;
    private String personagem;

    public Atuacao(Ator ator, Filme filme, String personagem) {
        this.ator = ator;
        this.filme = filme;
        this.personagem = personagem;
    }

    public Ator getAtor() {
        return ator;
    }

    public Filme getFilme() {
        return filme;
    }

    public String getPersonagem() {
        return personagem;
    }

    public static Atuacao atuar(Ator ator, Filme filme, String personagem) {
        Atuacao atuacao = new Atuacao(ator, filme, personagem);
        ator.adicionarAtuacao(atuacao);
        filme.adicionarAtuacao(atuacao);
        return atuacao;
    }
}
