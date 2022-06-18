package javaExercise1;

import java.util.Scanner;

public class Ques2 {
    public static int OddSum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i+=2){
            sum = sum+i;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end number: ");
        int n = sc.nextInt();

        int sum = OddSum(n);
        System.out.print("The sum of the odd numbers is: "+ sum);
    }
}
