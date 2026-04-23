import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // We use a Set of Lists to store our triplets.  
        // A Set automatically ignores duplicate items, which helps us return unique triplets.
        Set<List<Integer>> set = new HashSet<>();

        // First Loop: Pick the first number
        for(int i = 0; i < nums.length; i++) {
            
            // Second Loop: Pick the second number (must be after the first)
            for(int j = i + 1; j < nums.length; j++) {
                
                // Third Loop: Pick the third number (must be after the second)
                for(int k = j + 1; k < nums.length; k++) {
                    
                    // Check if the three selected numbers add up to zero
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        
                        // Create a temporary list to hold this specific triplet
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        
                        // IMPORTANT: Sort the triplet (e.g., [0, -1, 1] becomes [-1, 0, 1]).
                        // This way, the Set can identify that [-1, 0, 1] and [0, -1, 1] are duplicates.
                        Collections.sort(temp);
                        
                        // Add the sorted triplet to the set
                        set.add(temp);
                    }
                }
            }
        }
        
        // Convert the Set of unique triplets back into a List of Lists to match the return type
        List<List<Integer>> ans = new ArrayList<>(set);
        
        return ans;
    }
}
