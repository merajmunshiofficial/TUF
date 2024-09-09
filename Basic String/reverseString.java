import java.util.Vector;

class reverseString {
    public Vector<Character> reverseString(Vector<Character> s) {
        int i = 0; // Initialize pointer i to the start of the string
        int j = s.size() - 1; // Initialize pointer j to the end of the string

        while (i < j) {
            // Swap the characters at i and j
            char temp = s.get(i);
            s.set(i, s.get(j));
            s.set(j, temp);
            i++; // Move i towards the center
            j--; // Move j towards the center
        }
        return s;
    }

    public static void main(String[] args) {
        reverseString reverseString = new reverseString();
        Vector<Character> str = new Vector<>();
        str.add('h');
        str.add('e');
        str.add('l');
        str.add('l');
        str.add('o');

        Vector<Character> reversedStr = reverseString.reverseString(str); // Reverse the string

        for (char c : reversedStr) {
            System.out.print(c); // Print each character of the reversed string
        }
        System.out.println(); // New line after the output
    }
}
