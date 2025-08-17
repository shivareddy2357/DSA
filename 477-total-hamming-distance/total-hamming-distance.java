public class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int count = 1;
        for (int i = 0; i < 32; i++) {
            int b = 0;
            for (int j : nums) {
                b += (j & count) == 0 ? 0 : 1;
            }
            ans += b * (nums.length - b);
            count <<= 1;
        }
        return ans;
    }
}