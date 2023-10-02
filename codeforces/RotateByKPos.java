/**
 * Rotate the arrayList by K pos to the left
 */

import java.util.ArrayList;
import java.util.Collections;

public class RotateByKPos {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        //Mention how many position you want to rotate
        int k = 2;
        rotateByKPos(arr, k);
    }

    public static ArrayList<Integer> rotateByKPos(ArrayList<Integer> arr, int k){
        int n = arr.size();
        
        /**
         * Rotating an array to the left by k position is the same as rotating it to the right by n-k positions
         * Collections.rotate() supports only right rotation
         */
        Collections.rotate(arr, n-k);
        System.out.println(arr);
        return arr;
    }
}
