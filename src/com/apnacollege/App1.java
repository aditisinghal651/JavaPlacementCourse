package com.apnacollege;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter your number: ");
            number = sc.nextInt();
            System.out.println("You entered: "+ number);
            if (number >=0 ){
                System.out.println("You Won!!");
            }
            else{
                System.out.println("You Lose!!");
            }

        }while(number>=0);


    }
}
