# LeetCode 344: Reverse String

**Difficulty:** Easy  
**Language:** Java  
**Pattern:** Two Pointers

## Problem Statement
Reverse a character array in place.

**Example:**
```text
Input:  ['h', 'e', 'l', 'l', 'o']
Output: ['o', 'l', 'l', 'e', 'h']
```

## Approach 1: Brute Force — String Concatenation

**Idea:** Traverse the string from right to left and append each character to a new string.

- **Time Complexity:** O(n²)
- **Space Complexity:** O(n)

## Approach 2: StringBuilder

**Idea:** Use Java's built-in `StringBuilder.reverse()` method to reverse the string efficiently.

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Approach 3: Optimized — Two Pointers

**Idea:** Use two pointers, one at the beginning and one at the end of the character array. Swap their characters and move both pointers toward the center until they meet or cross.

### Java Solution

```java
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
```

**Time Complexity:** O(n) — approximately n/2 swaps.

**Space Complexity:** O(1) — only a temporary variable is used.

## Key Takeaway

The two-pointer approach is optimal because it reverses the given character array in place without creating an additional array.