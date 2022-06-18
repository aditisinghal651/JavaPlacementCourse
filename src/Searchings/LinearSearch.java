package Searchings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int x){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        //taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int answer = linearSearch(arr, x);
        System.out.println(answer);
    }
}
