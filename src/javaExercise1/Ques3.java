package javaExercise1;

import java.util.Scanner;

public class Ques3 {
    public static int GreaterNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String args[]){
        System.out.print("The greater number is: "+ GreaterNum());
    }
}
