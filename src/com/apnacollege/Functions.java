package com.apnacollege;

import java.util.Scanner;

public class Functions {
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.print("The Sum of the two numbers is: "+ sum);
    }
}
