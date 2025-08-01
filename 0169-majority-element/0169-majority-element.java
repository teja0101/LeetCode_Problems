class Solution {
    public int majorityElement(int[] nums) {
       int  count  = 1, ele = nums[0];
        for( int i = 1; i < nums.length; i++){
            if( nums[i] == ele) 
                count ++;
            else{
                count --;
                if( count <= 0){
                    ele = nums[i];
                    count  = 1;
                }
            }
        }
        return ele;
    }
}