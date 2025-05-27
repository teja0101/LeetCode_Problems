class Solution {
    public int differenceOfSums(int n, int m) {
        int i = 1, n1 = 0 , n2 = 0;
        while(i <= n){
            if((i % m) == 0)n1 += i;
            else n2 += i;
            i++;
        }
        return n2 - n1;
    }
}