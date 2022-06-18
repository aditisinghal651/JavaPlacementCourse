package javaExercise1;

import java.util.Scanner;

public class Ques1 {
    public static double calculateAverage(double a, double b, double c){
        double avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second Number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third Number: ");
        double c = sc.nextDouble();

        double avg = calculateAverage(a, b, c);
        System.out.println("The average of the 3 numbers is: "+ avg);
    }
}
