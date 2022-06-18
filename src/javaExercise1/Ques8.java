package javaExercise1;

import java.util.Scanner;

public class Ques8 {
    public static int power(int x, int n){
        int pow = 1;
        for(int i=1; i<=n; i++) {
            pow *= x;
        }
        return pow;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent number: ");
        int n = sc.nextInt();

        System.out.println("The answer is: "+ power(x, n));

        }
    }

