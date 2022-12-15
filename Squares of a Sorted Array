class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        lst = []
        for i in nums:
            lst.append(i*i)
        lst.sort()
        return lst
        
        
 --------------------------------------------------------------
 class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> list(nums.size());
        int l=0, h=nums.size()-1;
        for(int k=h;k>=0;k--)
        {
            if(abs(nums[l])>abs(nums[h]))
            {
                list[k]=nums[l]*nums[l++];
            }
                
            else
            {
                list[k]=nums[h]*nums[h--];
            }
                
        }
        return list;
        
    }
};

----------------------------------------------------------------------

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int []arr = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                arr[i] = nums[right]*nums[right];
                right--;
            }else{
                arr[i] = nums[left]*nums[left];
                left++;
            }
        }
        return arr;

    }
}
