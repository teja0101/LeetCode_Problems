class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> ans = new ArrayList<>();
          List<Integer> cur = new ArrayList<>();
                cur.add(1);
            ans.add(new ArrayList<>(cur) );
                cur.add(1);
            ans.add(new ArrayList<>(cur) );

        for(int i = 2;i <= rowIndex; i++){
                cur.clear();
                List<Integer> pre = new ArrayList<>(ans.get((i - 1) % 2));
                cur.add(1);
                int n = pre.size();
                for(int j = 1; j < n; j++){
                    cur.add( pre.get(j - 1) + pre.get(j) );
                }
                cur.add(1);
                ans.add( (i % 2),( new ArrayList<>(cur) ) );
        }
        return ans.get((rowIndex % 2));
    }
}