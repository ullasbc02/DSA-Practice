package Recursion;

public class CheckArraySorted {
    public static boolean Sorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        return Sorted(arr,idx+1);

    }
    public static void main(String[] args) {
        int arr[] ={1,2,5,4};
        System.out.print(Sorted(arr,0));
    }
}
