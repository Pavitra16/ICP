class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>>lst=new ArrayList<>();
        HashSet<List<Integer>>hs=new HashSet<>();
        Arrays.sort(a);
        int k=0;
        int i=1;
        int j=a.length-1;
        while(i<=a.length-2 && j<=a.length-1){
             int ele=0-a[k];
            while(i<j){
               
                int sum=a[i]+a[j];
                if(sum==ele){
                    List<Integer>l=new ArrayList<>();
                    l.add(a[k]);
                    l.add(a[i]);
                    l.add(a[j]);
                    hs.add(l);
                    i++;
                    j--;
                }
                else if(sum>ele) j--;
                else i++;
            }
            k++;
            i=k+1;
            j=a.length-1;
        }
        for(List l :hs) lst.add(l);
        return lst;
    }
}