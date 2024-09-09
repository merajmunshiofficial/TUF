class Solution {
    // Function to print pattern10
    public static void pattern10(int n) {
        // Outer loop for number of rows.
        for (int i = 1; i <= 2 * n - 1; i++) {

            /* stars would be equal to the
            row no. uptill first half */
            int stars = i;

            // for the second half of rotated triangle.
            if (i > n) stars = 2 * n - i;

            // for printing the stars in each row.
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            /* As soon as the stars for each iteration are printed,
            we move to the next row and give a line break */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();

        sol.pattern10(N);
    }
}