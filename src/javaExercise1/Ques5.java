package javaExercise1;

import java.util.Scanner;

public class Ques5 {
    public static void Eligibility(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.print("You are eligible to vote.");
        }else{
            System.out.print("Not eligible to vote. Come after few years!");
        }
    }

    public static void main(String args[]){
        Eligibility();
    }
}
