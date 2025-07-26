class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs[0].length();
        for(int i = 1;i < strs.length; i++){
            if(strs[i].length() <= n)
                n = strs[i].length();
            int idx = 0, count = 0;
            while(idx < n){
                String str0 = strs[i-1], str1 = strs[i];
                if(str0.charAt(idx) == str1.charAt(idx))
                    count++;
                else break;
                idx++;
            }
            n = Math.min(count,n);
        }
        if(n==0)
            return "";
        return strs[0].substring(0,n);
    }
}