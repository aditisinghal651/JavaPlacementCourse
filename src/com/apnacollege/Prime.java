package com.apnacollege;

import java.util.*;

public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = 0;

        //Logic
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            if(n == 1){
                System.out.println("Neither Prime nor Composite.");
            }else{
                System.out.println("This is Prime.");
            }
        }else{
            System.out.println("This is not a Prime Number.");
        }

    }
}
