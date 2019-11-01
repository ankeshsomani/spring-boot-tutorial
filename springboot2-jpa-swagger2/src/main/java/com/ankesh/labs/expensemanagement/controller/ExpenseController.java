package com.ankesh.labs.expensemanagement.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import com.ankesh.labs.expensemanagement.model.Expense;
import com.ankesh.labs.expensemanagement.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/expenses/v1")
@Api(value="Expense management system", description = "Add, edit, view, delete expenses")
public class ExpenseController {

    @Autowired
    ExpenseRepository expenseRepository;

    @ApiOperation(value="add an expense")
    @RequestMapping(method= RequestMethod.POST, value="/add")
    @ApiResponses({ @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    public Expense addExpense(@RequestBody Expense expense){
        if(expense!=null){
            expenseRepository.save(expense);
        }
        return expense;
    }
}
