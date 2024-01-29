import java.util.Arrays;

public class PairWithGivenDiff {
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 50, 80};
        int n = 78;
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            for(int i=0;i<high;i++){
                if(arr[high]-arr[low]==n)
                    System.out.println("("+arr[high]+","+arr[low]);
            }
        }
    }
}
