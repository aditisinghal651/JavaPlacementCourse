package com.apnacollege;

import java.util.Scanner;

public class Miniproj{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int urNumber;

        do{
            System.out.println("Guess your lucky number(1-100): ");
            urNumber = sc.nextInt();
             if(urNumber > myNumber){
                 System.out.println("Your number is too large ! Choose again.");
            }
             else if(urNumber < myNumber){
                 System.out.println("Your number is too small ! Choose again.");
            }
             else{
                 System.out.println("Woohooo...Correct Guess!!");
                 break;
             }

        }while(urNumber>=0);

        System.out.print("Your lucky number is: ");
        System.out.println(myNumber);
    }
}
