package Sorting;

public class Merge {

    public static void merge(int[] arr,int l, int mid, int r){
        int idx = mid+1;
        int[] temp = new int[r-l+1];
        int cnt = 0;
        int left = l;
        while(left<=mid && idx<=r){
            if(arr[left]<=arr[idx]){
                temp[cnt] = arr[left];
                left++;
                cnt++;
            }else{
                temp[cnt] = arr[idx];
                idx++;
                cnt++;
            }
        }

        while(left<=mid){
            temp[cnt++] = arr[left++];
        }
        while(idx<=r){
            temp[cnt++] = arr[idx++];
        }
        for(int i=l;i<=r;i++){
            arr[i] = temp[i-l];
        }
    }

    public static void mergeSort(int[] arr, int l, int r){

        if(l>=r) return;

        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }

    public static void main(String[] args){

        int arr1[] = new int[]{10,2,67,34,7};
        mergeSort(arr1,0,arr1.length-1);
        
        
        for(int k:arr1) System.out.print(k+" ");

    }
}