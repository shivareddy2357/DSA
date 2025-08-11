class Solution {
    public int trailingZeroes(int n) {
        
        int denom = 5;
        int ans  = 0;
        while(denom <= n){
            ans = ans + n/denom;
            denom = denom*5;
        }
        return ans;
    }
}