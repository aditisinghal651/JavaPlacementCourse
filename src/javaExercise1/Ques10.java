package javaExercise1;

import java.util.Scanner;

public class Ques10 {
    public static void Fibonacci(int n){
        int firstTerm=0, secondTerm=1;

        for(int i = 0; i<n; i++){
            System.out.print(firstTerm+" ");

            int nextTerm = firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of numbers you want to print: ");
        int n = sc.nextInt();
        Fibonacci(n);

    }
}
