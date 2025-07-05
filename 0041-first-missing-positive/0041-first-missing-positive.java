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
                int idx = ele - 1;
                if (nums[idx] > 0) {
                    nums[idx] = -nums[idx];
                } else if (nums[idx] == 0) {
                    nums[idx] = -(n + 1);
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