package com.apnacollege;

import java.util.*;

public class Functions5 {
    public static void CheckEven(int n){
        if(n == 0){
            System.out.print("Neither even nor odd.");
        }else if(n < 0) {
            System.out.printf("Negative number.");
        }else{
            if(n % 2 == 0){
                System.out.println("Number is EVEN.");
            }else{
                System.out.println("Number is ODD.");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        CheckEven(n);
    }
}
