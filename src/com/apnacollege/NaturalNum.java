package com.apnacollege;

import java.util.*;

public class NaturalNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end number: ");
        int n = sc.nextInt();

        System.out.println("The natural numbers are: ");
        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }

    }
}
