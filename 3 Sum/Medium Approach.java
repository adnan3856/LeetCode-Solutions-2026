class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // This set stores our final unique triplets (List of Lists)
        Set<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // This hashset stores numbers we've seen in the inner loop for the current 'i'
            Set<Integer> hashset = new HashSet<>();
            
            for (int j = i + 1; j < nums.length; j++) { 
                // We need: nums[i] + nums[j] + third = 0
                // Therefore: third = -(nums[i] + nums[j])
                int third = -(nums[i] + nums[j]);

                // Check 'hashset' for the integer 'third'
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    
                    // Sort so that [0, -1, 1] and [-1, 0, 1] are treated as the same triplet
                    Collections.sort(temp);
                    set.add(temp);
                }
                
                // Add the current number to hashset so it can be a "third" for future 'j' iterations
                hashset.add(nums[j]);
            }
        }
        // Convert the set of unique lists into the required return format
        return new ArrayList<>(set);
    }
}
