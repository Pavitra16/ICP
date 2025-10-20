class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Set<String> visit = new HashSet<>();
        String ans = s;
        Queue<String> q = new LinkedList<>();
        q.add(s);
        visit.add(s);

        while(!q.isEmpty()){
            String s1 = q.poll();
            if(ans.compareTo(s1) > 0){
                ans = s1;
            }

            // Operation 1: Add 'a' to all digits at odd indices
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s1.length(); i++){
                char c = s1.charAt(i);
                if(i % 2 == 0){
                    sb.append(c);
                } else {
                    int n = ((c - '0') + a) % 10;
                    sb.append(n);
                }
            }
            String st1 = sb.toString();
            if(visit.add(st1)) q.add(st1);

            // Operation 2: Rotate the string by 'b'
            String st2 = s1.substring(s1.length() - b) + s1.substring(0, s1.length() - b);
            if(visit.add(st2)) q.add(st2);
        }

        return ans;
    }
}