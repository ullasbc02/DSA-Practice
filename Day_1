//-------------------Running sum of 1D array------------------------
--First Approach

class Solution {
    public int[] runningSum(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count=count+nums[i];
            nums[i]=count;
            
        }
        return nums;
    }
}
--Second Approach

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
                continue;
            nums[i]=nums[i-1]+nums[i];
            
        }
        return nums;
    }
}


//---------------------------
