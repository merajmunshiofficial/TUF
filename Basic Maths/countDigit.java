class Solution {
    /* Function to count the 
    number of odd digits in N */
    public int countDigit(int n) {
        // Edge case
        if (n == 0) return 1;
        
        int count = (int)(Math.log10(n) + 1);
        return count;
    }

    public static void main(String[] args) {
        int n = 6678;

        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution(); 

        // Function call to get count of digits in n
        int ans = sol.countDigit(n);
        System.out.println("The count of digits in the given number is: " + ans);
    }
}