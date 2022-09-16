-------------------------Approach 1
class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,leftsum=0;
        for(int x:nums)
            sum+=x;
        for(int i=0;i<nums.length;i++){
            if(leftsum==sum-leftsum-nums[i])
                return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}


-----------------Approach 2-----
class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0,leftsum=0,sum=0,rightsum=0;
        for(int x:nums)
            totalsum+=x;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            leftsum=sum-nums[i];
            rightsum=totalsum-sum;
            if(leftsum==rightsum)
                return i;
            
        }
        return -1;
    }
}
