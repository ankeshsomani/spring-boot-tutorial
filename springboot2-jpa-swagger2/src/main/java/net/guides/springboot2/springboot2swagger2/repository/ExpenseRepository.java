package net.guides.springboot2.springboot2swagger2.repository;

import net.guides.springboot2.springboot2swagger2.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
