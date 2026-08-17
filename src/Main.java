public class Main {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario("Matheus", 3000, 40);
        Funcionario funcionario02 = new Funcionario("Carlos", 2500, 30);

        System.out.print("Antes:  ");
        System.out.println(funcionario01.toString());
        funcionario01.setNome("Jose");
        funcionario01.setNome("sakdkadkakdsakdakdskdakdksadkadkadsksakdakdsakdakdskadskakdakdakd");
        System.out.print("Depois: ");
        System.out.println(funcionario01.toString());
    }
}