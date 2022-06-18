package com.apnacollege;

import java.util.*;

public class EvenNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end number: ");
        int n = sc.nextInt();

        System.out.println("The even numbers are: ");
        for (int i = 1; i <=n; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
