package com.king;
/*
A functional interface is an interface that contains only one abstract method. 
They can have only one functionality to exhibit. From Java 8 onwards, lambda 
expressions can be used to represent the instance of a functional interface. 
Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
*/
@FunctionalInterface
interface IntegerMath {
    int operation(int a, int b);    // abstract method
    //A functional interface can have methods of object class.
    // It can contain any number of Object class methods.  
    int hashCode();
    boolean equals(Object obj);
}

public class FunctionalInterfaceDemo {    
    public static void main(String[] args) {
        //without lambda
        IntegerMath add = new IntegerMath(){
            public int operation(int a, int b){
                return a/b;
            }
        };        
        System.out.println(add.operation(44, 4));
        
        //with lambda
        IntegerMath addition = (a, b)->a+b;
        IntegerMath multiplication = (a, b)->a*b;        
        
        System.out.println(addition.operation(11,12));
        System.out.println(multiplication.operation(11,12));        
    }
}
