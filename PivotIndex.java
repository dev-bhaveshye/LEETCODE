package CRT_TAE2;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Found the pivot index
            }
            leftSum += nums[i]; // Update left sum
        }

        return -1; // No pivot index found
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2, 1, -1};

        System.out.println(pivotIndex(nums1)); // Output: 3
        System.out.println(pivotIndex(nums2)); // Output: -1
        System.out.println(pivotIndex(nums3)); // Output: 0
    }
}

