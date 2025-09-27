class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
       while(i<nums.length){
            int ind=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[ind]){
                int temp=nums[ind];
                nums[ind]=nums[i];
                nums[i]=temp;

            }
            else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) return j+1;
        }
        return nums.length+1;
    }
}