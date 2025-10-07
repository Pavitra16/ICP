class Solution {
    public int lengthOfLIS(int[] nums) {
        int a[]=new int[nums.length];
        int n=nums.length;
        Arrays.fill(a,1);
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    a[i]=Math.max(a[i],a[j]+1);
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++) ans=Math.max(ans,a[i]);
        return ans;
    }
}