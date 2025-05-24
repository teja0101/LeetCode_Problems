class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int idx = 0;
        for( String ele : words){
            if( ele.indexOf(x) >= 0) ans.add(idx);
            idx++;
        }
         return ans;
    }
}