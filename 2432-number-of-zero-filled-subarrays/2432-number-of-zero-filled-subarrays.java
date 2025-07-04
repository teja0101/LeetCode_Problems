class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0, count = 0;
        for(int ele : nums){
            if(ele == 0)
                count++;
            else count = 0;
            ans += count;
        }
        return ans;
    }
}