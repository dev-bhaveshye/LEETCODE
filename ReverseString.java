package CRT_TAE2;

class ReverseString {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split by spaces and remove extra spaces
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        
        return result.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        ReverseString sol = new ReverseString();
        System.out.println(sol.reverseWords("the sky is blue")); // Output: "blue is sky the"
        System.out.println(sol.reverseWords("  hello world  ")); // Output: "world hello"
        System.out.println(sol.reverseWords("a good   example")); // Output: "example good a"
    }
}

