package DSAApna;

import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        Arrays.sort(arr);
        int ppl = 7;
        int mindiff = Integer.MAX_VALUE;
        for (int i=0 ;i<=arr.length-ppl;i++){
            if(arr[i+ppl-1]-arr[i]<mindiff)
                mindiff=arr[i+ppl-1]-arr[i];
        }
        System.out.println(mindiff);
    }
}
