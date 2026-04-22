class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == target)
                return mid;
            // left is sorted or not
            if(arr[low] <= arr[mid]){
                if((arr[low] <= target) && (target <= arr[mid]) )
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // right is sorted or not
            else {
                if((arr[mid] <= target) && (target <= arr[high]) )
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
    }
}
