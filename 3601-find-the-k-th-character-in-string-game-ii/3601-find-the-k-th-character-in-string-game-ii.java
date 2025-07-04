class Solution {
    public char kthCharacter(long k, int[] operations) {
        int ops = 0;
        while( k > 1){
            //why log2(k)  to find nearst 2 pow to k because for every ops string leng mutiplies by two   
            int k_char_ops = (int) Math.ceil(Math.log(k)/Math.log(2)); /// on what operator dose kth char dependes up on
            k -= Math.pow(2,k_char_ops - 1);// to find previouse char where kth char depends 
            ops += operations[k_char_ops - 1]; // add that ops where kth and prveiouse char dependes 
        }
        return (char) ('a' + (ops % 26));////add all operations
    }
}