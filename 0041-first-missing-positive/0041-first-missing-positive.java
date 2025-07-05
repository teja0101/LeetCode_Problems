class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ele = 1;

        for(int i = 0; i < nums.length; i++){
            if( ele == nums[i] )    
                ele++;
        }
        return ele;
    }
}