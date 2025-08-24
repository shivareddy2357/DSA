class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0, end = n-1;
        int mid = 0;
        while (start < end){
            mid = (start + end)/2;
            if(nums[mid] == nums[mid+1]){
                mid = mid-1;
            }
            int startlen = (mid - start) + 1;
            if(startlen % 2 == 1){
                end = mid;
            }else{
                start = mid+1;
            }
        }    
        return nums[start];  
    }
}