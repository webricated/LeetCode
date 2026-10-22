class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();

        int n = senate.length();
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R') rad.offer(i);
            else dir.offer(i);
        }
        while(!rad.isEmpty() && !dir.isEmpty()){
            int r = rad.poll();
            int d = dir.poll();
            
            if(r < d) rad.offer(r+n);
            else dir.offer(d+n);
        }
        return dir.isEmpty() ? "Radiant" : "Dire";
    }
}