package br.com.patterncommerce.design_patterns.strategy;

import org.springframework.stereotype.Component;

@Component
public class PixPayment implements PaymentStrategy {
    @Override
    public String processPayment(double amount) {
        return String.format("Pagamento de R$%.2f processado via PIX", amount);
    }
}