package Recursion;

public class Power2 {
    public static int calcPower2(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n % 2 == 0){// if power is even.
            return calcPower2(x, n/2) * calcPower2(x, n/2);
        }else{//if power is odd.
            return calcPower2(x, n/2) * calcPower2(x, n/2) * x;
        }
    }

    public static void main(String args[]){
        int x = 2;
        int n = 5;
        int ans = calcPower2(x, n);
        System.out.println(ans);
    }
}
