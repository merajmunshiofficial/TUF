public class rotateString {
    // Strings must be of the same length to be rotations of each other
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;  
        }
        String doubledS = s + s;  // Concatenate s with itself
        return doubledS.contains(goal);  // Check if goal is a substring of s + s
    }

    public static void main(String[] args) {
        rotateString sol = new rotateString();
        System.out.println(sol.rotateString("abcde", "cdeab"));  
        System.out.println(sol.rotateString("abcde", "abced"));  
    }
}
