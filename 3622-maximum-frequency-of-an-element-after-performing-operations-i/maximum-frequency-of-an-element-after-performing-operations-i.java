class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int maxVal = Arrays.stream(nums).max().getAsInt()+k+2;
        int[] count = new int[maxVal];
        int res=0;

        for(int v : nums){
            count[v]++;
        }

        for (int i=1; i<maxVal; i++){
            count[i]+=count[i-1];
        }

        for (int i=0; i < maxVal; i++){
            int r= Math.min(maxVal-1, i+k);
            int l = Math.max(0, i-k);
            int diff = l > 0 ? count[l-1] : 0;
            int tot = count[r] - diff;
            int freq = count[i] - ( i>0 ? count[i-1] : 0 );
            res = Math.max(res, freq + Math.min(numOperations, tot-freq));
        }

        return res;
    }
}