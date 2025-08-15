class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int slen = s.length(), wrdlen = words[0].length(),widsize = wrdlen * words.length;
        List<Integer> ans = new ArrayList<>();
        Map<String, Integer> wrds = new HashMap<>();
        
        

        for (String ele : words) {
            wrds.put(ele, wrds.getOrDefault(ele, 0) + 1);
        }
        
        for(int st = 0; st < wrdlen; st++){
           Map<String, Integer> wid = new HashMap<>();
           int idx = st, left = idx;
            while( left + wrdlen <= widsize + st && left + wrdlen <= slen){
                String ele = s.substring(left, left + wrdlen);
                wid.put(ele,wid.getOrDefault(ele,0)+1);
                left += wrdlen;
            }
    
            while( left + wrdlen <= slen){

                if(wrds.equals(wid))
                    ans.add(idx);

                String ele = s.substring(idx, idx + wrdlen);

                if(wid.get(ele) == 1){
                    wid.remove(ele); 
                }
                else wid.put(ele,wid.get(ele) - 1);
                ele = s.substring(left,left + wrdlen);
                wid.put(ele, wid.getOrDefault(ele,0) + 1);
               
                left += wrdlen;
                idx += wrdlen;
            }
            if(wrds.equals(wid))
                ans.add(idx);
        }
        return ans;
    }
}
