import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entities.Contrato;
import services.ContratoServico;
import services.Payservice;
import entities.Parcelas;


class Programa {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


            System.out.print("Enter contract data: ");
            System.out.print("Number: ");  
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Date (dd/MM/yyyy): ");
            LocalDate dateStr = LocalDate.parse(sc.nextLine(), formatter); // Parse the date string to ensure it's in the correct format
            System.out.print("Contract value: ");
            double totalValue = sc.nextDouble();
            System.out.print("Enter number of installments: ");
            int months = sc.nextInt();
            Contrato contrato = new Contrato(number, dateStr, totalValue);
            ContratoServico contratoServico = new ContratoServico(new Payservice());
            contratoServico.processarContrato(contrato, months);

            System.out.println("Installments:");
            for (Parcelas p : contrato.getParcelas()) {
                System.out.println(p.getDataVencimento().format(formatter) + " - " + String.format("%.2f", p.getQuantidade()));
            }
        }

    }
    
}
