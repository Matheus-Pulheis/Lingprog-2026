package Composicao;

import java.util.ArrayList;

public class Casa {
    private String endereco;
    private ArrayList<Comodo> comodos;

    public Casa(String endereco) {
        this.endereco = endereco;
        comodos = new ArrayList<>();
        comodos.add(new Comodo("Sala", 20));
        comodos.add(new Comodo("Cozinha", 12));
        comodos.add(new Comodo("Quarto", 15));
    }

    public void listarComodos() {
        System.out.println("Casa: " + endereco);
        for (Comodo comodo : comodos) {
            System.out.println(comodo.getNome() + " - " + comodo.getAreaM2() + " m2");
        }
    }
}
