/*
Day 01 — Longest Common Prefix

Problem: LeetCode 14
Topic: Strings
Difficulty: Easy

What I learned:
- Comparing characters at the same index
- Finding the prefix common to all strings
- Handling the case where there is no common prefix

Approach:
- Take the first string as the reference.
- Compare its characters with the corresponding characters
  of the remaining strings.
- Stop when a mismatch is found.

Time Complexity: O(n × m)
Space Complexity: O(1)

Status: Solved independently
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];

        for (int j = 0; j < first.length(); j++) {

            char current = first.charAt(j);

            // Compare with every other string
            for (int i = 1; i < strs.length; i++) {

                // Check if current index exists
                if (j >= strs[i].length()) {
                    return first.substring(0, j);
                }

                // Check if character matches
                if (strs[i].charAt(j) != current) {
                    return first.substring(0, j);
                }
            }
        }

        return first;
    }
}
