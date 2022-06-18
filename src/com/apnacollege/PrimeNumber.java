package com.apnacollege;

import java.util.*;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int flag = 0;

        if(n == 0 || n == 1){
            System.out.println("Neither Prime nor Composite.");
        }else{
            for(int i=2; i<=n-1; i++){
                if(n % i == 0){
                    System.out.println(n + " is not a Prime Number.");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n + " is a Prime Number.");
            }
        }
    }
}
