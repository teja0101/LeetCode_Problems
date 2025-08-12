class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  p1 = 0,ans = 0, n = s.length();
        String str = "";
        if(s.equals(""))return ans;
        for(int idx = 0; idx < n; idx++){
            if(str.contains(String.valueOf(s.charAt(idx)))){
                p1 = str.indexOf(s.charAt(idx));
                
                String temp = str.substring(p1+1);
                str = temp + String.valueOf(s.charAt(idx));
            }
            else {
                str += String.valueOf(s.charAt(idx));
                ans = Math.max(ans, str.length());
            }
        }
        return ans;
    }
}