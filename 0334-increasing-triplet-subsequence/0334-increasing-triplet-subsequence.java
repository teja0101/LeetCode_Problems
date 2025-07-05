class Solution {
    public boolean increasingTriplet(int[] nums) {
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE;
        for(int i : nums){
            if(f >= i){
                f = i;
            }   
            else if(s >= i){
                    s = i;
                
            }
            else return true;
        }
        return false;
    }
}