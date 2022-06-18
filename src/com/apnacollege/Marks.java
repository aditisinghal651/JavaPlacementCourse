package com.apnacollege;

import java.util.*;

public class Marks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give an input either 1 or 0: ");
        int input = sc.nextInt();
        int marks = 0;
        do{
            if(input == 0){
                System.out.println("The application has been stopped.");
                break;
            }else if(input == 1){
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Enter your Marks(Out of 100): ");
                marks = sc1.nextInt();

                if(marks >= 90){
                    System.out.println("This is Excellent!!");
                }else if(marks<=89 && marks>=60){
                    System.out.println("This is very Good!!");
                }else if(marks<=59 && marks>=0){
                    System.out.println("This is Good!!");
                }else{
                    System.exit(0);
                }
            }else{
                System.out.println("Invalid Input.");
                break;
            }
        }while(marks>=0);

    }
}
