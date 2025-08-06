class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int idx = 31, ans = 0;
        while(idx >= 0){
            int bit = right & (1 << idx);
            if(bit == (left & (1 << idx))){
                ans |= bit; 
            }
            else return ans;
            idx --;
        }
        return ans;
    }
}