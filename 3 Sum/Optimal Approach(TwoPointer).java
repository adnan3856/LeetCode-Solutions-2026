import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Sort the array. This is crucial for the two-pointer approach to work 
        // and helps us easily skip duplicate numbers.
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // 2. Skip the same element to avoid duplicate triplets in the answer.
            // If the current number is the same as the previous one, we've already 
            // checked all possible triplets starting with this value.
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 3. Initialize two pointers: 'j' starts right after 'i', 'k' starts at the end.
            int j = i + 1, k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    // Sum is too small, move the left pointer right to increase the sum.
                    j++;
                } else if (sum > 0) {
                    // Sum is too large, move the right pointer left to decrease the sum.
                    k--;
                } else {
                    // Found a triplet that sums to zero!
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);

                    // Move both pointers to look for new potential numbers.
                    j++;
                    k--;

                    // 4. Skip duplicate values for 'j' and 'k' to avoid duplicate triplets.
                    // Check if the new 'j' is the same as the one we just used.
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    // Check if the new 'k' is the same as the one we just used.
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
    }
}
