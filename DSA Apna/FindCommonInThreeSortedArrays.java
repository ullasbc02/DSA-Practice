import java.util.*;
/* To get the common numbers from the 3 arrays
 * Get the iterator i,j,k for the three arrays and using while loop -> loop through the arrays
 * and check whether elements are equal in all the three arrays 
 * compare each element and increment if they are less
 * 
 * Note : the array must be in sorted order
 */
public class FindCommonInThreeSortedArrays {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        int a[] = {1, 2, 3} ;
        int b[] = {4, 5, 6} ;
        int c[] = {7, 8, 9} ;
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length && k<c.length) {
            if(a[i]==b[j] && b[j]==c[k]){
                l1.add(a[i]);
                i++;
                j++;
                k++;
            }
            else{
                if(a[i]<b[j])
                    i++;
                if(b[j]<c[k])
                    j++;
                if(c[k]<a[i])
                    k++;
            }
                    
        }
        System.out.println(l1);
    }
}
