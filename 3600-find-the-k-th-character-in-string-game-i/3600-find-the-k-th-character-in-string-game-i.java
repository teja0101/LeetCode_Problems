class Solution {
    public char kthCharacter(int k) {
        String ans = "a", ref = "abcdefghijklmnopqrstuvwxyz";
        while (ans.length() < k){
            String cur = "";
            for( char ele : ans.toCharArray()){
                cur += ref.charAt( ele - 'a' + 1); 
            }
            ans += cur;
        }
        return ans.charAt(k -1);
    }
}