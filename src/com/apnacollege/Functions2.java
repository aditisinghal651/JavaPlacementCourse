package com.apnacollege;

import java.util.Scanner;

public class Functions2 {
    public static int calculateProduct(int a, int b){
        return a * b;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("The product of two numbers is: "+ calculateProduct(a, b));
    }
}
