class Solution {
    // Function to print pattern8
    public static void pattern8(int n) {
        
        // Outer loop which will loop for the rows.
        for (int i = 0; i < n; i++) {
            
            //This loop will print the spaces
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            
            // This loop will print asterisk.
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            
            /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();

        sol.pattern8(N);
    }
}
