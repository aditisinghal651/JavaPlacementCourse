package com.apnacollege;

import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Which Number's table you want: ");
        int n = sc.nextInt();

        System.out.println("The Table is printed below: ");
        for(int i = 1; i<=10; i++){
            System.out.print(i * n + " ");
        }

    }
}
