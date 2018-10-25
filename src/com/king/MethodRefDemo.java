package com.king;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Lakshmanan.0018
 * A method reference is the shorthand syntax for a lambda expression that executes just ONE method.
 */
public class MethodRefDemo {
    public static void main(String[] args) {
        new Thread(MethodRefDemo::disp).start();
        
        List <Integer> list = Arrays.asList(10,20,30,40,50);
     
        //for(int num: list)print(num);        
        //for(int i=0; i<list.size(); i++) print(list.get(i));        
        //list.forEach(n->print(n));
        
        list.forEach(MethodRefDemo::print);        
        
        new Thread(()->disp()).start();        
       
    }
    static void print(final int num){
        System.out.println("I'm printing..." + num);
    }
    static void disp(){
        for(int i=0;i <6; i++)
            System.out.println("disp() method....");
    }
}
