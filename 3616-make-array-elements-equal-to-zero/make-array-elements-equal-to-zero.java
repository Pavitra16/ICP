class Solution {
    public int countValidSelections(int[] nums) {
        // run function on every 0
            // run helper in 2 directions -1 and 1;
            // check if all elements are 0
        int res = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0 && helper(i, -1, nums.clone())){
                res++;
            }

            if(nums[i] == 0 && helper(i, 1, nums.clone())){
                res++;
            }
        }

        return res;
    }

    private boolean helper(int index, int direction, int[]nums){
        int dir = direction;

        while(index+dir >= 0 && index+dir < nums.length){
            index +=dir;
            if(nums[index] > 0){
                nums[index]--;
                dir = dir == 1 ? -1 : 1;
            }
        }

        for(int i=0;i<nums.length;i++)if(nums[i]>0)return false;

        return true;
    }
}