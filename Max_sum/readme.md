# Maximum Subarray 
### Example
```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
```

## Solution Approaches

### 1. Brute Force Approach

#### Implementation Details
- Iterates through all possible subarrays using nested loops
- For each subarray, calculates its sum and keeps track of the maximum sum encountered
- Simple to understand but not efficient for large inputs

```java
public int maxSubArrayBruteForce(int[] nums) {
    int maxSum = nums[0];
    for (int i = 0; i < nums.length; i++) {
        int currentSum = 0;
        for (int j = i; j < nums.length; j++) {
            currentSum += nums[j];
            maxSum = Math.max(maxSum, currentSum);
        }
    }
    return maxSum;
}
```

#### Complexity Analysis
- Time Complexity: O(n²)
  - Outer loop runs n times
  - Inner loop can run up to n times for each iteration of outer loop
  - Results in n * n operations
- Space Complexity: O(1)
  - Uses only two variables (maxSum and currentSum)
 

### 2. Kadane's Algorithm Approach

#### Implementation Details
- Uses dynamic programming concepts
- Maintains two variables:
  - curr_max: tracks the maximum sum ending at current position
  - max_so_far: keeps track of the overall maximum sum found

```java
public int maxSubArray(int[] nums) {
    int max_so_far = nums[0];
    int curr_max = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        curr_max = Math.max(nums[i], nums[i] + curr_max);
        max_so_far = Math.max(curr_max, max_so_far);
    }
    return max_so_far;
}
```

#### Complexity Analysis
- Time Complexity: O(n)
  - Single pass through the array
 
- Space Complexity: O(1)
  - Uses only two variables (max_so_far and curr_max)

## Test Cases

The solution includes comprehensive test cases covering various scenarios:

1. Mixed positive and negative numbers
   ```java
   int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
   // Expected output: 6
   ```

2. Single element array
   ```java
   int[] nums2 = {1};
   // Expected output: 1
   ```

3. All negative numbers
   ```java
   int[] nums3 = {-2, -3, -4, -1, -5};
   // Expected output: -1
   ```

4. All positive numbers
   ```java
   int[] nums4 = {1, 2, 3, 4, 5};
   // Expected output: 15
   ```

5. Alternating positive and negative numbers
   ```java
   int[] nums5 = {1, -1, 2, -2, 3, -3, 4};
   // Expected output: 4
   ```

6. Large numbers
   ```java
   int[] nums6 = {1000, -2000, 3000, -4000, 5000};
   // Expected output: 5000
   ```

7. Zero elements
   ```java
   int[] nums7 = {0, 0, 0, 0};
   // Expected output: 0
   ```

8. Complex sequence
   ```java
   int[] nums8 = {-2, -3, 4, -1, -2, 1, 5, -3};
   // Expected output: 7
   ```
 