package LEETCODE;

public class Valid_Palindrome_125 {
    public static boolean isPalindrome(String s) {
        
        // String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // StringBuilder reverse = new StringBuilder(cleaned);
        // reverse.reverse();
        //  if (cleaned.equals(reverse.toString())){
        //     return true;
        //  }
        //  return false;

        // StringBuilder cleaned = new StringBuilder();
        // for (char c : s.toCharArray()) {
        //     if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') ) {
        //        cleaned.append(c);
        //     }
        // } 
        // String reversed = new StringBuilder(cleaned).reverse().toString();
        // String clean = cleaned.toString().toLowerCase();
        // reversed = reversed.toString().toLowerCase();
        // System.out.println(reversed);
        // System.out.println(cleaned);

        // if (clean.equals(reversed)){
        //      return true;
        // }
        // return false;

         int left = 0, right = s.length() - 1;

    while (left < right) {
        // Move left to next alphanumeric
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
        // Move right to previous alphanumeric
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

        // Compare lowercased characters
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        left++;
        right--;
    }

    return true;
        
    }
    public static void main(String[] args){
        
        String s = "Race a Car";
        System.out.println(isPalindrome(s));

    }
}
