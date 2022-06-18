package com.apnacollege;

import java.util.*;

public class Functions4 {
    public static void primeNum(int n){
        int flag = 0;
        if( n == 0 || n == 1){
            System.out.println("Neither Prime nor composite.");
        }else{
            for(int i = 2; i<=n-1; i++){
                if(n%i == 0){
                    System.out.println("This number is composite.");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("This number is Prime.");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        primeNum(n);
    }
}
