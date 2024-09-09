class Solution {
    // Function to print pattern14
    void pattern14(int n) {
        // Outer loop for the number of rows.
        for (int i = 0; i < n; i++) {
            
            /* Inner loop will loop for i times and
            print alphabets from A to A + i.*/
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            
            /*As soon as the letters for each iteration 
            are printed, we move to the next row and give
            a line break otherwise all letters would get
            printed in 1 line*/
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();

        sol.pattern14(N);
    }
}
