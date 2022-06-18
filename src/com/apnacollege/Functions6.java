package com.apnacollege;

import java.util.*;

public class Functions6 {
    public static int table(int n){
       int mul = 1;
        System.out.println("The table of "+n+ " is: ");
        for(int i = 1; i<= 10; i++){
           mul = n * i;
            System.out.println(mul);
       }
       return mul;
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        table(n);
     }
}
