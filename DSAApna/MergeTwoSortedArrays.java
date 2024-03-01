package DSAApna;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
         long arr1[] = new long[] { 0 ,1, 2 };
         long arr2[] = new long[] { 0 ,1, 2 ,3 };
         int size1 = arr1.length;
         int size2 = arr2.length;
         int i=0,j=0;
         while(i<size1 && j<size2){
            if(arr1[i]<arr2[j])
                i++;
            else{
                long temp = arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                Arrays.sort(arr2);
                i++;
            }
         }
        //  Arrays.sort(arr2);
         for (long k : arr1) {
            System.out.println(k);
         }
          for (long k : arr2) {
            System.out.println(k);
         }
    }
}
