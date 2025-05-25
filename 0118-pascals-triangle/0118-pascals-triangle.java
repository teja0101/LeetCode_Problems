class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < numRows; i++){
            List<Integer> cur = new ArrayList<>();
            if(i > 1){
                List<Integer> pre = new ArrayList<>(ans.get(i-1));
                cur.add(1);
                int n = pre.size();
                for(int j = 1; j < n; j++){
                    cur.add( pre.get(j - 1) + pre.get(j) );
                }
                cur.add(1);
                ans.add(new ArrayList<>(cur) );

            }
            else if(i == 1){
                cur.add(1);
                cur.add(1);
                ans.add(new ArrayList<>(cur));
            }
            else {
                cur.add(1);
                ans.add(new ArrayList<>(cur));
            }
        }
        return ans;
    }
}