class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int ele : nums){
            xor ^= ele;
        }
        int a = 0 ,b = 0;
       int rsb = xor & (-xor);
        for(int ele : nums){
            if((rsb & ele) == 0){
                a ^= ele;
            }
            else b ^= ele;
        }
        return new int[]{a,b};
    }

}