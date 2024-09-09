import java.util.*;

class Solution {
    /* Function to get the highest
    occurring element in array n */
    public int mostFrequentElement(int[] nums) {
        
        // Variable to store the size of array
        int n = nums.length;
        
        // Variable to store maximum frequency
        int maxFreq = 0; 
        
        /* Variable to store element
        with maximum frequency */
        int maxEle = 0;
        
        // HashMap
        Map<Integer, Integer> mpp = new HashMap<>();
        
        // Iterating on the array
        for (int i = 0; i < n; i++) {
            // Updating hashmap 
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
            
        // Iterate on the map
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            int ele = it.getKey(); // Key
            int freq = it.getValue(); // Value
            
            if (freq > maxFreq) {
                maxFreq = freq;
                maxEle = ele;
            } else if (freq == maxFreq) {
                maxEle = Math.min(maxEle, ele);
            }
        }
        
        // Return the result
        return maxEle;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6};
        
        /* Creating an instance of
        Solution class */
        Solution sol = new Solution();
        
        /* Function call to get the
        highest occurring element in array n */
        int ans = sol.mostFrequentElement(nums);
        
        System.out.println("The highest occurring element in the array is: " + ans);
    }
}