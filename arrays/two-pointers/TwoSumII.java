/*
Date: 16/09/2026
Problem: Two Sum II
Pattern: Two Pointers

What I learned:
- Why two pointers work on a sorted array
- How left and right pointers move
- How the approach reduces O(n²) to O(n)

Time Complexity: O(n)
Space Complexity: O(1)

My Reflection:
I initially thought about using nested loops.
I learned how the sorted array allows two pointers
to eliminate unnecessary comparisons.
*/

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}