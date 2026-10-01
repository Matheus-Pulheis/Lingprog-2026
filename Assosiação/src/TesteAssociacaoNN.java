package AssociacaoNN;

public class TesteAssociacaoNN {
    public static void main(String[] args) {
        // LIVROS E AUTORES
        Livro livro1 = new Livro("Livro Java");
        Livro livro2 = new Livro("Banco de Dados");
        Autor autor1 = new Autor("Carlos");
        Autor autor2 = new Autor("Maria");

        Autoria.autorar(livro1, autor1, "Autor principal");
        Autoria.autorar(livro1, autor2, "Coautor");
        Autoria.autorar(livro2, autor2, "Autor principal");
        livro1.listarAutores();
        livro2.listarAutores();

        System.out.println();

        // FILMES E ATORES
        Ator ator1 = new Ator("Joao");
        Ator ator2 = new Ator("Pedro");
        Filme filme1 = new Filme("Filme A");
        Filme filme2 = new Filme("Filme B");

        Atuacao.atuar(ator1, filme1, "Heroi");
        Atuacao.atuar(ator2, filme1, "Vilao");
        Atuacao.atuar(ator1, filme2, "Detetive");
        filme1.listarElenco();
        filme2.listarElenco();
    }
}
