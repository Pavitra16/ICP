class Solution {
    HashMap<String, Long> map = new HashMap<>();

    public int maxPartitionsAfterOperations(String s, int k) {
        int n = s.length();
        return 1 + (int)solve(s, k, 0, n, 0, 0);
    }

long solve(String s, int k, int i, int n, long uniquechars, int canchange) {
        if (i >= n)
            return 0;
        String key = i + "_" + uniquechars  + "_" + canchange;
        if (map.containsKey(key))
            return map.get(key);
        long ans = 0;
        int val = s.charAt(i) - 'a';
        long newuniquechars = uniquechars | (1 << val);
        if (Long.bitCount(newuniquechars) > k) {
            ans = Math.max(ans, 1 + solve(s, k, i + 1, n, 1 << val, canchange));

        } else {
            ans = Math.max(ans, solve(s, k, i + 1, n, newuniquechars, canchange));

        }
        if (canchange == 0) {
            for (int j = 0; j < 26; j++) {
                if(j==val)continue;
                long newupdatedchars = uniquechars | (1 << j);
                if (Long.bitCount(newupdatedchars) > k) {
                    ans = Math.max(ans, 1 + solve(s, k, i + 1, n, 1 << j, 1));
                } else {
                    ans = Math.max(ans, solve(s, k, i + 1, n, newupdatedchars, 1));
                }
            }
        }
        map.put(key, ans);
        return ans;

    }
}