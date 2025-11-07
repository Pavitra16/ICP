class Solution {

    public long maxPower(int[] stations, int r, long k) {
        int n = stations.length;

        // 1) Compute current power for each city using a sliding window over stations
        long[] power = new long[n];
        long windowSum = 0L;

        // Initial window covers [0, r] (clipped to n - 1)
        for (int j = 0; j <= Math.min(n - 1, r); j++) {
            windowSum += stations[j];
        }

        for (int i = 0; i < n; i++) {
            // Window currently represents sum over [i - r, i + r] clipped to [0, n - 1]
            power[i] = windowSum;

            // Slide window: remove (i - r), add (i + r + 1) if in bounds
            int removeIdx = i - r;
            if (removeIdx >= 0) {
                windowSum -= stations[removeIdx];
            }
            int addIdx = i + r + 1;
            if (addIdx < n) {
                windowSum += stations[addIdx];
            }
        }

        // 2) Binary search the maximum achievable minimum power
        long low = 0L;
        long high = Arrays.stream(power).max().orElse(0L) + k; // Safe upper bound
        long answer = 0L;

        while (low <= high) {
            long mid = low + (high - low) / 2; // Candidate minimum power
            if (canAchieveTarget(power, r, k, mid)) {
                answer = mid;      // mid is possible; try for higher
                low = mid + 1;
            } else {
                high = mid - 1;    // mid not possible; go lower
            }
        }

        return answer;
    }

    /**
     * Returns true if we can make every city's power >= target by adding
     * at most k stations overall. Uses a difference array to simulate the
     * effect range of added stations in O(n).
     */
    private boolean canAchieveTarget(long[] basePower, int r, long k, long target) {
        int n = basePower.length;

        long used = 0L;            // total stations added so far
        long[] diff = new long[n + 1]; // range effect difference array
        long runningAdd = 0L;      // current accumulated added effect at position i

        for (int i = 0; i < n; i++) {
            runningAdd += diff[i];           // apply scheduled changes at i
            long current = basePower[i] + runningAdd;

            if (current < target) {
                long need = target - current; // stations to add so that city i reaches target
                used += need;
                if (used > k) return false;   // exceeded budget

                // Add 'need' stations placed effectively at position (i + r),
                // which raises power for indices in [i, i + 2r] (clipped).
                runningAdd += need;

                int end = Math.min(n, i + 2 * r + 1);
                diff[end] -= need;           // schedule removal after the influence ends
            }
        }
        return true;
    }
}