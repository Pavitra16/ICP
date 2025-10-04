class Solution {
    public int numRabbits(int[] a) {
        Arrays.sort(a);
        int total=a[0]+1;
        int count=a[0];
        int prev=a[0];
        for(int i=1;i<a.length;i++){
            int curr=a[i];
            if(curr==prev && count>0){
                count--;
            }
            else {
                prev=a[i];
                count=a[i];
                total+=a[i]+1;
            }
        }
        return total;
    }
}