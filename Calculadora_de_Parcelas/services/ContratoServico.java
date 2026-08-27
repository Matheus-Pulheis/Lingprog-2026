
package services;

import java.time.LocalDate;
import entities.Contrato;
import entities.Parcelas;

public class ContratoServico {

    private OnlinePaymentService onlinePaymentService;

    public ContratoServico(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processarContrato(Contrato contrato, int meses) {
        double valorParcela = contrato.getValorTotal() / meses;
        for (int i = 1; i <= meses; i++) {
            LocalDate dataVencimento = contrato.getDate().plusMonths(i);

            double juros = onlinePaymentService.interest(valorParcela, i);
            double valorComjuros = valorParcela + juros;

            double taxaPagamento = onlinePaymentService.paymentFee(valorComjuros);
            double valorFinal = valorComjuros + taxaPagamento;

            contrato.getParcelas().add(new Parcelas(dataVencimento, valorFinal));

        }
    }
}