class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean flage = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0)
                nums[i] = nums.length + 2; /// even if len + 2 number is present in the arraya 
            if(nums[i] == nums.length)
                flage = true;   //defanatliy missing   numbers is smaller that n+2 
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int ele = -1 * nums[i];
                if (ele < nums.length)
                    if (nums[ele] > 0)
                        nums[ele] = -1 * nums[ele];

            }
             else {
                int ele =  nums[i];
                if (ele  < nums.length)
                    if (nums[ele] > 0)
                        nums[ele] = - 1 * nums[ele];
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0)
                return i;
        }
        if(flage)return((nums.length) + 1);
        return nums.length;

    }
}