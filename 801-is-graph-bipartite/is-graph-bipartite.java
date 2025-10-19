class Solution {
    public boolean isBipartite(int[][] graph) {
        int visited[]=new int[graph.length];
        Arrays.fill(visited,-1);
        for(int i=0;i<visited.length;i++){
            if(visited[i]==-1) {
                if(dfs(visited,graph,i,0)==false) return false;
            }
        }
        return true;
    }
    public boolean dfs(int visited[], int graph[][], int st, int c ){
        visited[st]=c;
        for(int i: graph[st]){
            if(visited[i]==-1){
                if(dfs(visited,graph,i,1-c)==false) return false;
            }
            else {
                if(visited[i]==c) return false;
            }
        }
        return true;

    }
}