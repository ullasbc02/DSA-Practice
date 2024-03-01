package DSAApna;

import java.util.*;

class MinAndMaxEleArray{  
    public static void main(String args[]){  
        int arr[] = {4,8,2,9};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        // int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]<min)
        //         min=arr[i];
        //     if(arr[i]>max)
        //         max=arr[i];
        // }
        // System.out.println(min);
        // System.out.println(max);
    }

    
}  