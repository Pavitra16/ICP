class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       
        int n=nums.length;
        int m1=nums[n-1];
        int m2=nums[n-2];
        int m3=nums[n-3];
        int min1=nums[0];
        int min2=nums[1];
        return Math.max(m1*m2*m3,min1*min2*m1);
        
    }
}