class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N <= 0) return -1;
        if(N == 1) return 1;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < N; i++) adj.add(new ArrayList<Integer>());

        for(int i = 0; i < trust.length; i++){
            int u = trust[i][0];
            int v = trust[i][1];
            adj.get(u-1).add(v-1);
        }

        for(int i = 0; i < adj.size(); i++){
            boolean flag = false;
            if(adj.get(i).size() == 0){
                for(int j = 0; j < adj.size(); j++){
                    if(i == j) continue;
                    flag = adj.get(j).contains(i);
                    if(flag == false) break;
                }
                if(flag == true) return i+1;
            }
        }
        return -1;
    }
}


