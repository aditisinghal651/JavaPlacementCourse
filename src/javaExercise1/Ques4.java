package javaExercise1;

import java.util.Scanner;

public class Ques4 {
    public static void CirclePerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int r = sc.nextInt();

        double circumference = 2*3.14*r;
        System.out.println("The circumference of the circle is: "+ circumference);
    }

    public static void main(String args[]){
        CirclePerimeter();
    }
}
