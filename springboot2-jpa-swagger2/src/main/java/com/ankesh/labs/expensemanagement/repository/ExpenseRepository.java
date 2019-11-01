package com.ankesh.labs.expensemanagement.repository;

import com.ankesh.labs.expensemanagement.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
