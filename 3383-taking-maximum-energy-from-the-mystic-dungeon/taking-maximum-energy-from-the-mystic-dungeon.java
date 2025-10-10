class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] store = new int[k];
        int ans = Integer.MIN_VALUE;
        for(int i = energy.length - 1 ; i >= 0 ; i--) {
            store[i%k] += energy[i];
            ans = Math.max(ans,store[i%k]);
        }
        return ans;
    }
}