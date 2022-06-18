package Recursion;

public class PrintNumbers {
    public static void printNumb(int n){
        //Base Case
        if(n == 0){
            return;
        }
        //print
        System.out.print(n+" ");
        //Recursive Call
        printNumb(n-1);
    }

    public static void printNumb2(int n){
        //Base Case
        if(n == 6){
            return;
        }

        //print
        System.out.print(n+" ");
        printNumb2(n+1);
    }

    public static void main(String args[]){
        int n = 5;
        int m =1;
        printNumb(n);
        System.out.println();
        printNumb2(m);
    }
}
