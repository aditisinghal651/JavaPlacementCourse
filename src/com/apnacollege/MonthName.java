package com.apnacollege;

import java.util.Scanner;

public class MonthName {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number(1-12): ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("01 - January");
                break;
            case 2:
                System.out.println("02 - February");
                break;
            case 3:
                System.out.println("03 - March");
                break;
            case 4:
                System.out.println("04 - April");
                break;
            case 5:
                System.out.println("05 - May");
                break;
            case 6:
                System.out.println("06 - June");
                break;
            case 7:
                System.out.println("07 - July");
                break;
            case 8:
                System.out.println("08 - August");
                break;
            case 9:
                System.out.println("09 - September");
                break;
            case 10:
                System.out.println("10 - October");
                break;
            case 11:
                System.out.println("11 - November");
                break;
            case 12:
                System.out.println("12 - December");
                break;
            default:
                System.out.println("Invalid Number entered !!");
        }
    }
}

