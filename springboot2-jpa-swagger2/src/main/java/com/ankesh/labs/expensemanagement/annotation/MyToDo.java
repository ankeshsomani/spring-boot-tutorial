package com.ankesh.labs.expensemanagement.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyToDo {
    public enum Priority {LOW, MEDIUM, HIGH}
    String author() default "Ankesh";
    Priority priority() default Priority.LOW;
}
