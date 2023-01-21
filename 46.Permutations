class Solution {
    public void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void perfuc(int[] nums,int pos,List<List<Integer>> list){
        if(pos==nums.length-1){
            List<Integer> small = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                small.add(nums[i]);
            }
            list.add(small);
        }
        for(int i=pos;i<nums.length;i++){
            swap(nums,pos,i);
            perfuc(nums,pos+1,list);
            swap(nums,pos,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        perfuc(nums,0,list);
        return list;
        
    }
}
