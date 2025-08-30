package br.com.patterncommerce.design_patterns.strategy;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public String processPayment(double amount) {
        return String.format("Pagamento de R$%.2f processado com cartão de crédito", amount);
    }
}
