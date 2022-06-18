package Recursion;

public class Power {
    public static int calcPower(int x, int n){
        //base case
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int Nm1 = calcPower(x, n-1);
        int xpowN = x * Nm1;
        return xpowN;
    }

    public static void main(String args[]){
        int x = 2;
        int n = 5;
        System.out.println(calcPower(x, n));
    }
}
