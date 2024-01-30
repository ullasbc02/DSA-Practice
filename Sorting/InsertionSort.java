package Sorting;

/*Start by picking the second element in the array
Now compare the second element with the one before it and swap if necessary.
Continue to the next element and if it is in the incorrect order, iterate through the sorted portion (i.e. the left side) to place the element in the correct place.
Repeat until the array is sorted. */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{4,6,2,5,1};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = 0;
            for(j =  i - 1; j >= 0 && arr[j] > temp; j--){
                arr[j + 1] = arr[j];
            }
            arr[j+1] = temp;
        }
        System.out.println("The Sorted Array is:");
        for(int k : arr){
            System.out.print(k+" ");
        }System.out.println();

    }
}
