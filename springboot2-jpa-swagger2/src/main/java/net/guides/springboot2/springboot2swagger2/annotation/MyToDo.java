package net.guides.springboot2.springboot2swagger2.annotation;

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
