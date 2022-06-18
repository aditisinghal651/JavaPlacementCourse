package Recursion;

public class factorial {
    public static int fact(int n){
        //base case
        if(n == 0 || n==1){
            return 1;
        }

        int fact_nm1 = fact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String args[]){
        System.out.println(fact(5));
    }
}
