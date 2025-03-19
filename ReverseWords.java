package CRT_TAE2;

class ReverseWords {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left = 0;

        for (int right = 0; right <= chars.length; right++) {
            if (right == chars.length || chars[right] == ' ') {
                reverse(chars, left, right - 1);
                left = right + 1; // Move to next word
            }
        }
        return new String(chars);
    }

    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseWords sol = new ReverseWords();
        System.out.println(sol.reverseWords("Let's take LeetCode contest")); // Output: "s'teL ekat edoCteeL tsetnoc"
        System.out.println(sol.reverseWords("Mr Ding")); // Output: "rM gniD"
    }
}

