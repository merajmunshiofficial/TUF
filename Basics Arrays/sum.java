class Solution {
    public int sum(int[] arr, int n) {
        // Initialize sum to 0
        int sum = 0;
        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Add each element to the sum
            sum += arr[i];
        }
        return sum;
    }
   // The main method
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Sum of array elements: " + sol.sum(arr, n));
    }
}
