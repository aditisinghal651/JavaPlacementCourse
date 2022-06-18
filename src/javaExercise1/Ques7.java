package javaExercise1;

import java.util.*;

public class Ques7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, countPositive=0, countNegative=0, countZero=0;
        char choice;
        do{
            System.out.print("Enter the number: ");
            n = sc.nextInt();

            if(n > 0){
                countPositive++;
            }else if(n < 0){
                countNegative++;
            }else{
                countZero++;
            }
            System.out.println("Do you want to continue y/n?");
            choice = sc.next().charAt(0);

        }while(choice=='y'|| choice=='Y');

        System.out.println("Positive Numbers entered: "+ countPositive);
        System.out.println("Negative Numbers entered: "+ countNegative);
        System.out.println("Zero Numbers entered: "+ countZero);
    }
}
