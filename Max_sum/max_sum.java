package Max_sum;
class MaximumSubarray {
    // Brute Force approach
    public int maxSubArrayBruteForce(int[] nums) {
        int maxSum = nums[0];  // Initialize with first element
        
        // Outer loop for start point
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            // Inner loop to try all possible end points
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                // Update maxSum if currentSum is larger
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
//####################################################################################################################
    // Kadane's Algorithm approach
    public int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int curr_max = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            curr_max = Math.max(nums[i], nums[i] + curr_max);
            max_so_far = Math.max(curr_max, max_so_far);
        }
        return max_so_far;
    }
//####################################################################################################################

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();
        
        // Test Case 1: Mixed positive and negative numbers
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test Case 1 (Mixed numbers):");
        System.out.println("Brute Force Appo.: " + solution.maxSubArrayBruteForce(nums1));
        System.out.println("Kadane's Algo.: " + solution.maxSubArray(nums1));
        // Expected output: 6

        // Test Case 2: Single element
        int[] nums2 = {1};
        System.out.println("\nTest Case 2 (Single element):");
        System.out.println("Brute Force Appo.: " + solution.maxSubArrayBruteForce(nums2));
        System.out.println("Kadane's Algo.: " + solution.maxSubArray(nums2));
        // Expected output: 1

        // Test Case 3: All negative numbers
        int[] nums3 = {-2, -3, -4, -1, -5};
        System.out.println("\nTest Case 3 (All negative numbers):");
        System.out.println("Brute Force Appo.: " + solution.maxSubArrayBruteForce(nums3));
        System.out.println("Kadane's Algo.: " + solution.maxSubArray(nums3));
        // Expected output: -1

        // Test Case 4: All positive numbers
        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println("\nTest Case 4 (All positive numbers):");
        System.out.println("Brute Force Appo.: " + solution.maxSubArrayBruteForce(nums4));
        System.out.println("Kadane's Algo.: " + solution.maxSubArray(nums4));
        // Expected output: 15

        // Test Case 5: Alternating positive and negative with overall positive sum
        int[] nums5 = {1, -1, 2, -2, 3, -3, 4};
        System.out.println("\nTest Case 5 (Alternating numbers):");
        System.out.println("Brute Force Appo.: " + solution.maxSubArrayBruteForce(nums5));
        System.out.println("Kadane's Algo.: " + solution.maxSubArray(nums5));
        // Expected output: 4

        // Test Case 6: Large numbers
        int[] nums6 = {1000, -2000, 3000, -4000, 5000};
        System.out.println("\nTest Case 6 (Large numbers):");
        System.out.println("Brute Force Appo.: " + solution.maxSubArrayBruteForce(nums6));
        System.out.println("Kadane's Algo.: " + solution.maxSubArray(nums6));
        // Expected output: 5000

        // Test Case 7: Zero elements
        int[] nums7 = {0, 0, 0, 0};
        System.out.println("\nTest Case 7 (Zero elements):");
        System.out.println("Brute Force Appo.: " + solution.maxSubArrayBruteForce(nums7));
        System.out.println("Kadane's Algo.: " + solution.maxSubArray(nums7));
        // Expected output: 0

        // Test Case 8: Complex sequence
        int[] nums8 = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("\nTest Case 8 (Complex sequence):");
        System.out.println("Brute Force Appo.: " + solution.maxSubArrayBruteForce(nums8));
        System.out.println("Kadane's Algo.: " + solution.maxSubArray(nums8));
        // Expected output: 7
    }
}