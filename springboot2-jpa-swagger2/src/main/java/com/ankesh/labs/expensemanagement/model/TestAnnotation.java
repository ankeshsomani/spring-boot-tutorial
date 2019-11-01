package com.ankesh.labs.expensemanagement.model;

import com.ankesh.labs.expensemanagement.annotation.MyToDo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) {
        Class foo = Foo.class;
        Annotation[] annotations = foo.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println("*****1*****");
        Method[] methods = foo.getMethods();
        for (Method method : methods) {
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            int count = 1;
            for (Annotation declaredAnnotation : declaredAnnotations) {
                System.out.println("**********" + count);
                System.out.println(declaredAnnotation);
                if (declaredAnnotation.annotationType() == MyToDo.class) {
                    MyToDo myToDo = (MyToDo) declaredAnnotation;
                    System.out.println(((MyToDo) declaredAnnotation).priority());
                    System.out.println(((MyToDo) declaredAnnotation).author());
                }
                count++;
            }
        }
    }
}
class Foo {
    @MyToDo(priority = MyToDo.Priority.HIGH, author = "ANKESH SOMANI")
    public void someMethod() {
        System.out.println(" in some method");
    }
}