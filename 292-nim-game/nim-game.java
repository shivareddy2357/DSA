class Solution {
    public boolean canWinNim(int n) {
        if(n == 1 || n == 2) return true;
        return n%4!=0;
    }
}