package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

        private int numero;
        private LocalDate date;
        private double valorTotal;
        private List<Parcelas> parcelas = new ArrayList<>();

        public Contrato (int numero, LocalDate dateStr, double valorTotal){
            this.numero = numero;
            this.date = dateStr;
            this.valorTotal = valorTotal;
            
        } 
    
        public List<Parcelas> getParcelas() {
        return parcelas;
    }

       public int getMesData() {
        return date.getMonthValue();
       }

        public int getNumero() {
            return numero;
        }

        public LocalDate getDate() {
            return date;
        }

        public double getValorTotal() {
            return valorTotal;
        }

}
