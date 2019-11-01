package com.ankesh.labs.expensemanagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import com.ankesh.labs.expensemanagement.domain.ExpenseType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXPENSE_SEQ")
    @SequenceGenerator(name = "EXPENSE_SEQ", sequenceName = "EXPENSE_SEQ", allocationSize = 1)
    private long id;

    @Column(name = "description", nullable = false)
    @ApiModelProperty(value = "expense description", example = "shopping in DMart")
    private String description;

    @Column(name = "expenseType", nullable = false)
    @ApiModelProperty(value = "expense type", example = "FOOD", allowableValues = "FOOD, TRAVEL, ENTERTAINMENT, HOUSEHOLD")
    private ExpenseType expenseType;

    @Column(name = "amount", nullable = false)
    @ApiModelProperty(value = "amount spend", example = "1")

    private Double amount;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "IST")
    @Column(name = "expenseDate", nullable = false)
    @ApiModelProperty(value = "date of your expense", example = "2019-11-01 15:50:00")
    private Date expenseDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", expenseType=" + expenseType +
                ", amount=" + amount +
                ", ExpenseDate=" + expenseDate +
                '}';
    }
}
