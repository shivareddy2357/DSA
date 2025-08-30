class Solution {
    int firstOcc(int[] nums , int target) {
        int l = 0 , h = nums.length - 1;
        int res = -1;

        while(l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                res = mid;
                h = mid - 1;
            }
            else if (nums[mid] > target) h = mid - 1;
            else l = mid + 1;
        }
        return res;
    }

    int lastOcc(int[] nums , int target) {
        int l = 0 , h = nums.length - 1;
        int res = -1;

        while(l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                res = mid;
                l = mid + 1;
            }
            else if (nums[mid] > target) h = mid - 1;
            else l = mid + 1;
        }
        return res;
    }

    public int[] searchRange(int[] nums, int target) {
        int f = firstOcc(nums , target);
        int l = lastOcc(nums , target);
        return new int[]{f , l};
    }
}