class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for( int ele : nums){
            if(ele > 0) 
                set.add(ele);
        }
        int ans = 1;
        boolean flag = true;
        while(flag){
            flag = set.contains(ans);
            if(flag)    
                ans++;
        } 
        return ans; 
    }
}