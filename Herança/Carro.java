package Heranca;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numeroPortas = numeroPortas;
    }
}
