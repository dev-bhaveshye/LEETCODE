package CRT_TAE2;

public class MaxScoreSplit {
    public static int maxScore(String s) {
        int totalOnes = 0, leftZeros = 0, maxScore = Integer.MIN_VALUE;

        // Count total number of 1s in the string
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        // Iterate through the string and compute score at each split
        for (int i = 0; i < s.length() - 1; i++) { // Stop at second last index
            if (s.charAt(i) == '0') {
                leftZeros++; // Increase left zero count
            } else {
                totalOnes--; // Decrease right one count
            }
            maxScore = Math.max(maxScore, leftZeros + totalOnes);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        System.out.println(maxScore("011101")); // Output: 5
        System.out.println(maxScore("00111"));  // Output: 5
        System.out.println(maxScore("1111"));   // Output: 3
    }
}

