package CRT_TAE2;

class Occurance {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Occurance sol = new Occurance();
        System.out.println(sol.strStr("sadbutsad", "sad")); // Output: 0
        System.out.println(sol.strStr("leetcode", "leeto")); // Output: -1
    }
}
