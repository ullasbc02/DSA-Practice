package Sorting;

public class Merge {

    public static int[] merge(int[] arr1, int[] arr2){
        int res[] = new int[arr1.length+arr2.length];
        int i=0,j=0,count=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                res[count++] = arr1[i++];
            }
            else{
                res[count++] = arr2[j++];
            }
        }

        while(i>=0 && i<arr1.length){
            res[count++]=arr1[i++];
        }
        while (j>=0 && j<arr2.length) {
            res[count++] = arr2[j++];
        }
        return res;
    }

    public static int[] mergeSort(int[] splt){
        if(splt.length <= 1){
            return splt;
        }
        int mid = splt.length / 2;
        int[] left = new int[mid];
        int[] right = new int[splt.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = splt[i];
        }

        for (int i = mid; i < splt.length; i++) {
            right[i - mid] = splt[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);

    }

    public static void main(String[] args){

        int arr1[] = new int[]{10,2,67,34,7};
        int res[] = mergeSort(arr1);
        
        
        for(int k:res) System.out.print(k+" ");

    }
}