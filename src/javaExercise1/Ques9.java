package javaExercise1;

import java.util.Scanner;

public class Ques9 {
    public static int GreatestCommonDivisor(int a, int b){
        int gcd =1;
        for(int i=1; i<=a && i<=b; ++i){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        return gcd;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int b = sc.nextInt();

        int gcd = GreatestCommonDivisor(a, b);
        System.out.println("GCD of "+a+" and "+b+" is "+ gcd);

    }
}
