class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int p1 = 0, p2 = 0, ans = Integer.MAX_VALUE, sum = nums[p1];
        boolean flag = true;
        while(p2 < nums.length && p1 <= p2){
            if(sum >= target){
                ans = Math.min(ans,(p2 - p1 + 1));
                sum -= nums[p1];
                p1++;
                flag = false;
            }
            else {
                p2++;
                if(p2 < nums.length )
                sum += nums[p2];
            }
        }
        if(flag)    
            ans = 0;
        return ans;
    }
}