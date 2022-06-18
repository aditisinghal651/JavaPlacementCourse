package com.apnacollege;

import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give your first input: ");
        double a = sc.nextDouble();
        System.out.print("Give your second input: ");
        double b = sc.nextDouble();
        System.out.print("Give the Operation you wish to perform: ");
        String operator = sc.next();

        switch(operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/": if(b == 0){
                System.out.println("Invalid Division.");
            }else
                System.out.println(a/b);
                break;
            case "%":if(b == 0){
                System.out.println("Invalid Division.");
            }else
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Operation");
        }

    }
}
