class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        int n=numCourses;
        List<List<Integer>>lst=new ArrayList<>();
        for(int i=0;i<n;i++) lst.add(new ArrayList<>());
        for(int i=0;i<pre.length;i++){
            lst.get(pre[i][1]).add(pre[i][0]);
        }
        int visited[][]=new int[n][n];
        return cycle(lst);
    }
    public boolean cycle(List<List<Integer>>lst){
        int indegree[]=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            for(int node:lst.get(i)){
                indegree[node]++;
            }
        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0) q.add(i);
        }
        List<Integer>topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.remove();
           topo.add(node);
            for(int it:lst.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }

        }
        return topo.size()==lst.size();
    }
}