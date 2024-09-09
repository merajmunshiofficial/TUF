class Solution {
    /* Function to check if a 
    number is palindrome or not */
    public boolean isPalindrome(int n) {
        // Create a copy of original number
        int copy = n;
        
        /* After the code, revNum will
        contain the reversed number */
        int revNum = 0;

        /* Keep on iterating while there
        are digits left to extract */
        while (n > 0) {
            int lastDigit = n % 10;

            /* Pushing last digit at the
            back of reversed number */
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        
        /* Return true if the reversed and 
        copy of original number is same */
        return revNum == copy;
    }

    public static void main(String[] args) {
        int n = 12321;
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution();
        
        // Function call to check if n is a palindrome
        boolean ans = sol.isPalindrome(n);
        
        if (ans) {
            System.out.println("The given number is a palindrome");
        } else {
            System.out.println("The given number is not a palindrome");
        }
    }
}
