class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=Integer.MIN_VALUE;
        int water=0;
        while(i<j){
           water=(j-i)*Math.min(height[i],height[j]);
           ans=Math.max(ans,water);
           if(height[i]<height[j]) i++;
           else if(height[i]>height[j]) j--;
           else {
            i++;
            j--;
           }
        }
        return ans;
    }
}