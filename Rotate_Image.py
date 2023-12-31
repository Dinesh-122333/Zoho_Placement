class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        for i in range(len(matrix)):
            for j in range(i,len(matrix[i])):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

        print(matrix)        
        for i in range(len(matrix)):
            matrix[i]=matrix[i][::-1]
        return(matrix)

# Time complexity: O(n*m)
# Space complexity: O(1)
