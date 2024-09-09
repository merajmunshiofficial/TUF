class Solution {
    /* Function to find whether the
    number is prime or not */
    public boolean isPrime(int n) {
        // Edge case
        if(n < 2) return false;
        
        /* Variable to store the 
        count of divisors of n */
        int count = 0;
        
        // Loop from 1 to square root of n
        for(int i = 1; i <= Math.sqrt(n); ++i) {
            
            // Check if i is a divisor
            if(n % i == 0) {
                // Increment Count
                count = count + 1;
                
                /* Check if counterpart divisor
                is different from original divisor */
                if(n % i != i) {
                    
                    // Increment count
                    count = count + 1;
                }
            }
        }
        
        // If count is 2, n is prime
        if(count == 2) return true;
        // Else not prime
        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution();
        
        /* Function call to find whether the
         given number is prime or not */
        boolean ans = sol.isPrime(n);
        
        if (ans) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}