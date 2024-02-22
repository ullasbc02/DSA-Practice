package Sorting;
import java.util.*;

//https://www.youtube.com/watch?v=imqr13aIBAY&t=45s
public class CountSort {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 3, 4};
        int maxi = arr[0]; 
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int countarr[] = new int[maxi+1];
        for (int i = 0; i < arr.length; i++) {
            countarr[arr[i]]++; // as array is starting from index 0 so we
        }
        //cummulative array
        for(int i=1;i <countarr.length;i++){
            countarr[i] +=countarr[i-1];
        }
        int []outputArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            outputArray[countarr[arr[i]] - 1] = arr[i];
            countarr[arr[i]]--;
        }
        for (int i : outputArray) {
            System.out.println(i);
        }

    }
}
