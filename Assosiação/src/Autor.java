package AssociacaoNN;

import java.util.ArrayList;

public class Autor {
    private String nome;
    private ArrayList<Autoria> autorias;

    public Autor(String nome) {
        this.nome = nome;
        autorias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAutoria(Autoria autoria) {
        autorias.add(autoria);
    }
}
