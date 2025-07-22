class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>();
        Queue<Integer> D = new LinkedList<>();

        int n = senate.length();
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R') R.add(i);
            else D.add(i);
        }

        while(!R.isEmpty() && !D.isEmpty()){
            int indR = R.poll();
            int indD = D.poll();

            if(indR < indD) R.add(indR + n);
            else D.add(indD + n);
        }
        return R.isEmpty() ? "Dire" : "Radiant";
    }
}

