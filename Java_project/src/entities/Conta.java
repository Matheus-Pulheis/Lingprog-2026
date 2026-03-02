package entities;

public class Conta {
    private int num, num2;
    
    public Conta(int num, int num2){
        this.num = num;
        this.num2 = num2;
    }
    
    public int soma(int num, int num2){
        int result = num + num2;
        return result;
    }
}
