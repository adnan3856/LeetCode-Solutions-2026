class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            // OPTIMIZATION: If the current search range is already sorted, 
            // the smallest element is nums[low].
            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break; 
            }

            // Case 1: Left half is sorted
            if (nums[low] <= nums[mid]) {
                // Since the left side is sorted, nums[low] is the smallest in this range
                ans = Math.min(ans, nums[low]);
                // Eliminate the left half and search in the right half
                low = mid + 1;
            } 
            // Case 2: Right half is sorted
            else {
                // If the left side isn't sorted, the right side MUST be.
                // nums[mid] could be the minimum element
                ans = Math.min(ans, nums[mid]);
                // Eliminate the right half and search in the left half
                high = mid - 1;
            }
        }
        return ans;
    }
}
