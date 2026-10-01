package Heranca;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }
}
