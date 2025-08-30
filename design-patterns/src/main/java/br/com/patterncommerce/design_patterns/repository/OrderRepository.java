package br.com.patterncommerce.design_patterns.repository;

import br.com.patterncommerce.design_patterns.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}