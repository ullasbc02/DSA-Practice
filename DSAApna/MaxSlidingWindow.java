package DSAApna;

public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];

        int maxi = Integer.MIN_VALUE;
        // for(int i=0; i<k;i++){
        //     if(nums[i]>maxi)
        //         maxi=nums[i];
        // }

        for(int i = 0;i<nums.length-k+1;i++){
            int j = i+k-1;
            for(int m=i;m<=j-1;m++){
                if(nums[m]>maxi)
                    maxi = nums[m];
            }
            res[i] = maxi;
            maxi = Integer.MIN_VALUE;
        }
        return res;
        
    }
    public static void main(String[] args) {
        maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
    }
}
