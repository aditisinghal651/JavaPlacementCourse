package javaExercise1;

import java.lang.Math;
import java.util.Scanner;

import javaExercise1.Ques8;

public class Q8usingLib {
    public static double power(int x, int n){
        return Math.pow(x, n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent number: ");
        int n = sc.nextInt();

        System.out.println("The lib computed answer is: "+power(x, n));

    }
}
