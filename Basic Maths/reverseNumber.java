class Solution {
    // Function to reverse given number n
    public int reverseNumber(int n) {
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
        
        return revNum;
    }

    public static void main(String[] args) {
        int n = 6678;
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution();
        
        // Function call to reverse the digits in n
        int ans = sol.reverseNumber(n);
        System.out.println("The reverse of given number is: " + ans);
    }
}