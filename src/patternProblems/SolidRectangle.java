package patternProblems;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String args[]){
        //Row input
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the number of rows: ");
        int n = sc.nextInt();

        //Column input
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Give the number of columns: ");
        int m = sc1.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}