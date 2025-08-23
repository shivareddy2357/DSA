class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0, end = n-1;
        int mid = 0;
        while(start < end){
            mid = start + (end - start)/2;
            if(nums[mid] < nums[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
        
    }
}