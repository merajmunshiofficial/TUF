class Solution {
    public boolean anagramStrings(String s, String t) {
        // If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length()) return false; 

        // Create an array to count the frequency 
        // of each character (26 lowercase letters)
        int[] count = new int[26]; 

        // Increment the count for each character
        // in the first string
        for (char c : s.toCharArray()) count[c - 'a']++; 

        // Decrement the count for each character 
        // in the second string
        for (char c : t.toCharArray()) count[c - 'a']--; 

        // If any count is not zero, the strings are not anagrams
        for (int i : count) {
            if (i != 0) return false; 
        }

        // If all counts are zero, the strings are anagrams
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "INTEGER";
        String str2 = "TEGERNI";
        boolean result = solution.anagramStrings(str1, str2);
        // Print the result as True or False
        System.out.println(result ? "True" : "False"); 
    }
}

