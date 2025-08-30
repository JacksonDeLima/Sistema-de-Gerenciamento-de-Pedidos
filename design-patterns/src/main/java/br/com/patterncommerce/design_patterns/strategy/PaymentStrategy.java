package br.com.patterncommerce.design_patterns.strategy;

public interface PaymentStrategy {
    String processPayment(double amount);
}