class Solution {
    
    // Function to count the odd numbers in an array 
    public int countOdd(int[] arr, int n) {
        int count = 0;
        // Iterate through the array
        for (int i = 0; i < n; i++) {
        //  Check for odd values and increment
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    
    //Main method
    public static void main(String[] args) {
        
        // Creating an instance of Solution class
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        // Function call to count the odd numbers in an array
        int count = sol.countOdd(arr, n);
        System.out.println("Count of odd numbers: " + count);
    }
}