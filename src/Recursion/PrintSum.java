package Recursion;

public class PrintSum {
    public static void Sum(int i, int n, int sum){
        //Base Case
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        //Work done
        sum += i;

        //Recursive Call
        Sum(i+1, n, sum);
    }

    public static void main(String args[]){
        Sum(1, 5, 0);
    }
}
