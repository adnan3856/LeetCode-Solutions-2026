class Solution {
    public int search(int[] nums, int target) {
        return recursiveSearch(nums, 0, nums.length-1, target);
    }

    public int recursiveSearch(int nums[], int low, int high, int target) {
        if(low > high)
            return -1;
        int mid = (low+high)/2;
        if (nums[mid] == target)
            return mid;
        else if(target > nums[mid])
            return recursiveSearch(nums, mid+1, high, target);
        return recursiveSearch(nums, low, mid-1, target);
    }
}
