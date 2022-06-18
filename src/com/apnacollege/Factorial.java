package com.apnacollege;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;

        if(n < 0){
            System.out.println("Invalid Number entered.");
        }else{
            for(int i = n; i>=1; i--){
                fact = fact * i;
            }
            System.out.println("The factorial of " + n + " is " + fact);
        }
    }
}

