package entities;

import java.time.LocalDate;

public class Parcelas {
       
        private LocalDate dataVencimento;
        private double quantidade;

        public Parcelas(LocalDate dataVencimento, double quantidade){
            this.dataVencimento = dataVencimento;
            this.quantidade = quantidade;
        }

        public LocalDate getDataVencimento() {
            return dataVencimento;
        }

        public double getQuantidade() {
            return quantidade;
        }

        public String toString() {
            return dataVencimento + " - " + String.format("%.2f", quantidade);
        }
    
}