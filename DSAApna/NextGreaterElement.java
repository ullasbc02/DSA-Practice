package DSAApna;

import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        Stack<Integer> st1 = new Stack<>();

        for(int i=nums2.length-1 ; i>=0; i--){

            if(st1.isEmpty()){
                st1.push(nums2[i]);
                hash.put(nums2[i],-1);
            }

            else{
                while(!st1.isEmpty() && st1.peek()<nums2[i]){
                    st1.pop();      
                }
                // arr[i] = st1.peek();
                if(st1.isEmpty()){
                    st1.push(nums2[i]);
                    hash.put(nums2[i],-1);
                }else{
                    hash.put(nums2[i],st1.peek());
                    st1.push(nums2[i]);
                }
                

            }
        }
        int res[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(hash.containsKey(nums1[i])){
                res[i] = hash.get(nums1[i]);
            }else{
                continue;
            }
        }

    return res;
        
    }
    public static void main(String[] args) {
        int nums1[] = new int[]{4,1,2};
        int nums2[] = new int[]{1,3,4,2};
        int arr[] = nextGreaterElement(nums1,nums2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
