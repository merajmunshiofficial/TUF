import java.util.*;

class Solution {
    /* Function to count the 
    number of digits in N */
    private int countDigit(int n) {
        int count = (int)(Math.log10(n) + 1);
        return count;
    }

    /* Function to find whether the
    number is Armstrong or not */
    public boolean isArmstrong(int n) {
        
        // Store the count of digits
        int count = countDigit(n);
        
        // Variable to store the sum
        int sum = 0;
        
        // Variable to store the copy
        int copy = n;
        
        /* Iterate through each
        digit of the number */
        while (n > 0) {
            
            // Extract the last digit
            int lastDigit = n % 10;
            
            // Update sum
            sum += Math.pow(lastDigit, count);
            
            /* Remove the last digit
             from the number */
            n = n / 10;
        }
        
        /* Check if the sum of digits raised to the
        power of k equals the original number */
        if (sum == copy) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 153;
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution();
        
        /* Function call to find whether the
        given number is Armstrong or not */
        boolean ans = sol.isArmstrong(n);
        
        if (ans) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
