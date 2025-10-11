class Solution {
    long[] md;
    boolean[] ready;
    int[] power;
    int n;
    
    int first(int l, int r, long x) {
      int res = n;
      while (l <= r) {
        int m = l+(r-l)/2;
        if (power[m] >= x) {
          r = m-1;
          res = m;
        } else {
          l = m+1;
        }
      }
      return res;
    }

    long dp(int i) {
      if (i >= n)
        return 0;
      if (ready[i])
        return md[i];
      ready[i] = true;
      int next = first(i+1, n-1, power[i]+1);
      md[i] = Math.max(dp(next), power[i]*(long)(next-i)+dp(first(i+1, n-1, power[i]+3)));
      return md[i];
    }

    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power);
        n = power.length;
        md = new long[power.length];
        this.power = power;
        ready = new boolean[power.length];
        return dp(0);
    }
}