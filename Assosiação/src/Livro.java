package AssociacaoNN;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private ArrayList<Autoria> autorias;

    public Livro(String titulo) {
        this.titulo = titulo;
        autorias = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarAutoria(Autoria autoria) {
        autorias.add(autoria);
    }

    public void listarAutores() {
        System.out.println("Livro: " + titulo);
        for (Autoria autoria : autorias) {
            System.out.println(autoria.getAutor().getNome() + " - " + autoria.getPapel());
        }
    }
}
