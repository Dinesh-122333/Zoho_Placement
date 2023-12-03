class Solution:
    def palindromePairs(self, words: List[str]) -> List[List[int]]:
        #Brute Force(Time Limit Exceeded)    
        lst = []
            
            for i in range(len(words)):
                for j in range(len(words)):
                    if i!=j:
                        combined = words[i] + words[j]
                        if combined == combined[::-1]:
                            lst.append([i, j])

            return (lst)
        #Time Complexity:O(n^2*m)
        #Space Complexity:O(n^2)
