class Solution {
    public int search(int[] nums, int target) {
        int ans = nums[0], n = nums.length, l = 0, h = n-1;
        while(l <= h){

            int mid = l + (h-l) /2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[l] <= nums[mid]){
                if(target >= nums[l] && target <= nums[mid]){
                    h = mid - 1;
                }else{
                    l = mid + 1;
                }
            }else{
                if(target <= nums[h] && target >= nums[mid]){
                    l = mid + 1;
                }else{
                    h = mid - 1;
                }
            }
            
        }
        return -1;
    }
}