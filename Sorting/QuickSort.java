package Sorting;

//https://www.youtube.com/watch?v=UA_Rmjfj4bw&t=1328s

public class QuickSort {
    public static void Swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int Partition(int arr[], int left, int right){
        
        int pivot = arr[left];

        int i = left;
        int j = right;

        while(i<j){

            while(i<=right && pivot>=arr[i]) i++;
            while(pivot<arr[j] && j>left) j--;

            if(i<j){
                Swap(arr, i, j);
            }
        }
        Swap(arr,left,j);
        return j;

    }

    public static void Quicksort(int arr[], int left, int right){
        
        if(left<right){
            int pivot = Partition(arr, left, right);
            Quicksort(arr, left, pivot-1);
            Quicksort(arr, pivot+1, right);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        Quicksort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
