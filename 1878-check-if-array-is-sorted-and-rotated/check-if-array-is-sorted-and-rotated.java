class Solution {
    public boolean check(int[] nums) {
        int d = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int idx = (i+1) % n;
            if(nums[idx]<nums[i]){
                d++;
            }
        }
        if(d>1) return false;
        return true;
    }
}