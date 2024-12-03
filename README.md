# Find-All-Anagrams-in-a-String
Given two strings s and p, return an array of all the start indices of p's anagrams in s. An anagram is a permutation of a string.

Example:
Input:
s = "cbaebabacd", p = "ABC"

Output:
[0, 6]
Explanation:
The substring "cba" starting at index 0 and "bac" starting at index 6 are anagrams of "ABC".

Explanation of the Approach:
Sliding Window Technique:

Use a sliding window of length p to traverse the string s.
Maintain character frequency arrays for both the current window in s and the string p.
Frequency Comparison:

Compare the frequency arrays of the current window and p. If they match, the starting index of the current window is added to the result.
Efficiency:

The solution efficiently uses the sliding window to maintain frequency counts, resulting in a time complexity of O(n).

