package CRT_TAE2;
public class MinSubarrayLength {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) { // Shrink the window from the left
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int target1 = 7, nums1[] = {2, 3, 1, 2, 4, 3};
        int target2 = 4, nums2[] = {1, 4, 4};
        int target3 = 11, nums3[] = {1, 1, 1, 1, 1, 1, 1, 1};

        System.out.println(minSubArrayLen(target1, nums1)); // Output: 2
        System.out.println(minSubArrayLen(target2, nums2)); // Output: 1
        System.out.println(minSubArrayLen(target3, nums3)); // Output: 0
    }
}
