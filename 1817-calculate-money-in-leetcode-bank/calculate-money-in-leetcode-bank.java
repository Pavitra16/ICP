class Solution {
    public int totalMoney(int n) {

        long w = n / 7;
        long r = n % 7;

        long fullWeeksSum = 7 * w * (w + 7) / 2;         
        long remDaysSum   = r * (2 * w + r + 1) / 2;     

        return (int) fullWeeksSum + (int) remDaysSum;
    }
}