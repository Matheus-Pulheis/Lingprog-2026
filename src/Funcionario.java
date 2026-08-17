public class Funcionario {

    private String nome;
    private double salario;
    private int cargaHoraria;

    public Funcionario(){
        this.setNome(nome);
        this.setCargaHoraria(cargaHoraria);
        this.setSalario(salario);
    }

    public Funcionario(String nome, double salario, int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNome(String nome) {
        if (nome == null || nome.length() > 50){
            System.out.println("Nome invalido!");
        }
        else {
            this.nome = nome;
        }
    }

    public void setSalario(double salario) {
        if (salario <= 0){
            System.out.println("Salario invalido!");
        }
        else {
            this.salario = salario;
        }
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 1 && cargaHoraria <= 44){
            this.cargaHoraria = cargaHoraria;
        }
        else {
            System.out.println("Carga horaria invalida!");
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "\nnome='" + getNome() + '\'' +
                ", \nsalario=" + getSalario() +
                ", \ncargaHoraria=" + getCargaHoraria() +
                '}';
    }
}
