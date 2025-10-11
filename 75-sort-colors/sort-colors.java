class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, n = nums.length;
        for(int num : nums) {
            if(num == 0) a++;
            else if(num == 1) b++;
        }  

        for(int i = 0; i < a; ++i) {
            nums[i] = 0;
        }

        for(int i = a; i < a + b; ++i) {
            nums[i] = 1;
        }

        for(int i = a + b; i < n; ++i) {
            nums[i] = 2;
        }
    }
}