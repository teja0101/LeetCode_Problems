class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fsmall = Integer.MAX_VALUE, Ssmall = Integer.MAX_VALUE;
        for(int i : nums){
            if(fsmall >= i){
                fsmall = i;
            }   
            else if(Ssmall >= i){
                    Ssmall = i;
                
            }
            else return true;
        }
        return false;
    }
}