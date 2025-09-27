class Solution {
    public long kMirror(int k, int n) {
        int l=1;
        long sum=0;
        while(n>0){
            int l1=(l+1)/2;
            int min=(int)Math.pow(10,l1-1);
            int max=(int)Math.pow(10,l1)-1;
            for(int i=min;i<=max && n>0 ;i++){
                String n1=newnum(i,l);
                long num=Long.parseLong(n1);
                String convert=base(num,k);
                boolean pal=ispal(convert);
                if(pal){
                    sum+=num;
                    n--;
                }
            }
            l++;
        }
        return sum;
    }
    public String newnum(int num, int l){
        String n=""+num;
        String n1= new StringBuilder(n).reverse().toString();
        if(l%2==0){
            n=n+n1;
        }
        else {
            n=n+n1.substring(1);
        }
        return n;
    }
    public String base(long n, int k){
        StringBuilder s=new StringBuilder();
        while(n!=0){
            long q=n/k;
            long r=n%k;
            s.append(r);
            n/=k;
        }
        return s.toString();
    }
    public boolean ispal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}