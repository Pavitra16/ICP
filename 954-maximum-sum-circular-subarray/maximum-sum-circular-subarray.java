class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min_sum=Integer.MAX_VALUE;
        int max_sum=Integer.MIN_VALUE;
        int total=0;
        int min=0;
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            total+=nums[i];
            min+=nums[i];
            min_sum=Math.min(min_sum,min);
            if(min>0) min=0;
            max+=nums[i];
            max_sum=Math.max(max_sum,max);
            if(max<0) max=0;

        }
        if(max_sum<0) return max_sum;
        return Math.max(total-min_sum,max_sum);
    }
}