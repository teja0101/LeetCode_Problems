class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int idx = 0; idx < n - 2; idx++) {
            if (idx > 0 && nums[idx] == nums[idx - 1])
             continue;
            int target = -nums[idx];
            int p1 = idx + 1, p2 = n - 1;
            while (p1 < p2) {
                if (nums[p1] + nums[p2] == target) {
                    ans.add(Arrays.asList(nums[idx], nums[p1], nums[p2]));
                    while(p1 < p2 && nums[p1] == nums[p1 + 1])p1++;
                    while(p1 < p2 && nums[p2] == nums[p2 - 1])p2--;
                    p1++;
                    p2--;
                } 
                else if (nums[p1] + nums[p2] > target)
                    p2--;
                else p1++;
            }
        }
        return ans;
    }
}