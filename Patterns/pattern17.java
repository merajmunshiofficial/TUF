import java.util.*;
class Solution {
    // Function to print pattern17
    public void pattern17(int n) {
        // Outer loop for the number of rows.
        for (int i = 0; i < n; i++) {
            
            // Printing spaces before characters.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Printing characters.
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // Printing spaces after characters.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to the next line for the next row.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        
        //Create an instance of Solution class
        Solution sol = new Solution();
        
        sol.pattern17(N);
    }
}
