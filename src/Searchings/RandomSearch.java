package Searchings;

/*It doesn't follow any particular pattern to search for an element.
It has same time complexity as that of Linear Search i.e. O(n).
 */

import java.util.Random;

public class RandomSearch {

    public static boolean find(int arr[], int key){
        Random rand = new Random();
        int randPos = rand.nextInt(((arr.length - 1) - 0) + 1) + 0; // arr.length - 1 is used because index start at 0.

        if(arr[randPos] == key){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        boolean isFound = false;
        int attempts = 0;
        int key = 45;
        int[] myArr = {1, 89, -24, 45, 112, 5, 0, 333, 24};

        //let's use while loop
        while(!isFound){
            attempts++;
            if(find(myArr, key)){
                isFound = true;
            }
        }
        System.out.println("Item " + key + " was found in " + attempts + " attempts.");
    }
}
