package br.com.patterncommerce.design_patterns.strategy;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PaymentContext {
    private final Map<String, PaymentStrategy> strategies;

    public PaymentContext(List<PaymentStrategy> strategyList) {
        strategies = strategyList.stream()
                .collect(Collectors.toMap(
                    s -> s.getClass().getSimpleName().replace("Payment", "").toLowerCase(),
                    Function.identity()
                ));
    }

    public String executePayment(String method, double amount) {
        PaymentStrategy strategy = strategies.get(method.toLowerCase());
        if (strategy == null) {
            throw new IllegalArgumentException("Método de pagamento não suportado: " + method);
        }
        return strategy.processPayment(amount);
    }
}