/*
Date: 16/09/2026
Problem: Two Sum II
Pattern: Two Pointers

Approach:
Use two pointers:
- left starts from the beginning.
- right starts from the end.
- If the sum is smaller than the target, move left forward.
- If the sum is larger than the target, move right backward.
- If the sum equals the target, return the positions.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Two Pointers can reduce a nested-loop O(n²) approach to O(n)
when the array is sorted and pointer movement can be determined.
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