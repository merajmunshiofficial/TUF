class Solution {
    
    /* Function to find the
    factorial of a number */
    public int factorial(int n) {
        // Variable to store the factorial
        int fact = 1;

        // Iterate from 1 to n
        for(int i = 1; i <= n; i++) {
            // Multiply fact with current number
            fact = fact * i;
        }
        
        // Return the factorial stored
        return fact;
    }

    public static void main(String[] args) {
        int n = 4;
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution();
        
        // Function call to find the factorial of n
        int ans = sol.factorial(n);
        
        System.out.println("The factorial of given number is: " + ans);
    }
}
