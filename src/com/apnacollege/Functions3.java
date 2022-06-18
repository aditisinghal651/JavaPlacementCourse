package com.apnacollege;

import java.util.Scanner;

public class Functions3 {
    public static void CalculateFact(int n){
        if(n < 0){
            System.out.println("Invalid Number.");
            return;
        }
        int fact = 1;
        for(int i =n; i>=1; i--){
            fact = fact * i;
        }
        System.out.println(n+"! = "+ fact);
        return;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        CalculateFact(n);
    }
}
