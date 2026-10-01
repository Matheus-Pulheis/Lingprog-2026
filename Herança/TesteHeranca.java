package Heranca;

import java.util.ArrayList;

public class TesteHeranca {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Fiat", 2020, 4));
        veiculos.add(new Moto("Honda", 2022, 160));

        System.out.println("VEICULOS");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }

        System.out.println();

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Retangulo(10, 5));

        double total = 0;
        for (Forma forma : formas) {
            total = total + forma.calcularArea();
        }

        System.out.println("Soma das areas: " + total);
    }
}
