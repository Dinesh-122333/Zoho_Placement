class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        #optimal solution
        if len(s)>0 :
            char_index_map = {}
            start = 0
            max_length = 0

            for end in range(len(s)):
                if s[end] in char_index_map and char_index_map[s[end]] >= start:
                    start = char_index_map[s[end]] + 1

                char_index_map[s[end]] = end
                max_length = max(max_length, end - start + 1)

            return max_length
        else:
            return 0   

        Time complexity: O(n)
        Space complexity: O(1)
