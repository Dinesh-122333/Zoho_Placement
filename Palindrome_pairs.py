class Solution:
    def palindromePairs(self, words: List[str]) -> List[List[int]]:
            lst = []
            
            for i in range(len(words)):
                for j in range(len(words)):
                    if i!=j:
                        combined = words[i] + words[j]
                        if combined == combined[::-1]:
                            lst.append([i, j])

            return (lst)
