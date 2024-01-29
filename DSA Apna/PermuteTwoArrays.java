import java.util.Arrays;
import java.util.Collections;

public class PermuteTwoArrays{
    public static void main(String[] args) {
        int a[] = {2, 1, 3};
        Integer b[] = { 7, 8, 9 };
        int k = 10;
        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());
        for (int i = 0;i<a.length; i++ ) {
            if(a[i]+b[i]<k)
                System.out.println(false);
            System.out.println(true);
        }
    }
}
