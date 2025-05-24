class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        int ans = nums[0];

        while(l <= h){
            int mid = l + ((h - l)) / 2;

            if(ans > nums[mid]){
                ans = nums[mid];
            }

            if(nums[mid] < nums[h]){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }



        return ans;
    }
}