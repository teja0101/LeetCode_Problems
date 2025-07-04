class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0)
                nums[i] = n + 1;
        }
        for (int i = 0; i < n; i++) {

            int ele = Math.abs(nums[i]);
            if (ele >= 1 && ele <= n) {
                if (nums[ele - 1] > 0) {
                    nums[ele - 1] = -nums[ele - 1];
                } else if (nums[ele - 1] == 0) {
                    nums[ele - 1] = -(n + 1);
                }
            }

        }

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}