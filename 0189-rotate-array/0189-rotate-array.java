class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if(k == 0);
        else {
            for(int i = 0; i < (n - k) / 2 ; i++){
                int swap = nums[n - k - i - 1];
                nums[n - k - i - 1] = nums[i];
                nums[i] = swap; 
            }
            for(int i = 0 ; i < k / 2; i++){
                int swap = nums[n - k + i];
                nums[n - k + i] = nums[n - 1 - i];
                nums[n - 1 - i] = swap;
            }
            for( int i = 0; i < n / 2 ; i++){
                int swap = nums[i];
                nums[i] = nums[n - i - 1];
                nums[n - i - 1] = swap;
            }
        }
    }
}