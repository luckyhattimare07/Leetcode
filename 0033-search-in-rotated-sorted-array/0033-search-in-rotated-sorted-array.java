class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid overflow

            // If mid points to the target
            if (nums[mid] == target) {
                return mid;
            }

            // If left part is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // Target in left half
                } else {
                    low = mid + 1;  // Target in right half
                }
            } 
            // If right part is sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1; // Target in right half
                } else {
                    high = mid - 1; // Target in left half
                }
            }
        }

        return -1; 
    }
}