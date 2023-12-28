class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        #brute force
        if len(s)>0 :
            arr = list(s)
            lst = []
            len_arr = []

            for i in range(len(s)):
                sub_arr = []
                for k in range(i, len(s)):
                    if arr[k] not in sub_arr:
                        sub_arr.append(arr[k])
                    else:
                        break
                lst.append(sub_arr)

            for i in range(len(lst)):
                length = len(lst[i])
                len_arr.append(length)

            result = max(len_arr)
            return result  
        else:
            return 0   
            
        # Time Complexity: O(n^2)
        # Space Complexity: O(n)
        
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

        # Time complexity: O(n)
        # Space complexity: O(1)

        #Optimal solution2 using Pointers
        alpha = []
        left, right, lenght = 0, 0, 0
        while right < len(s):
            if s[right] not in alpha:
                alpha.append(s[right])
                if lenght < right - left + 1: 
                    lenght = right - left + 1
                right += 1
            elif s[right] in alpha:
                alpha.remove(s[left])
                left += 1  
        return lenght
    # Time Complexity : O(n)
    # Space Complexity : O(min(n,m))
