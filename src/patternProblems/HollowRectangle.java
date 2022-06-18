package patternProblems;

import java.util.Scanner;

public class HollowRectangle {
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
                //cell -> (i, j)
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
