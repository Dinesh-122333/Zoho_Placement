class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        arr=[[0 for j in range(n)]for i in range(n)]
        ele=0
        top, bottom, left, right = 0, n-1, 0, n-1
        while top<=bottom and left<=right:
            for i in range(left, right+1):
                ele += 1
                arr[top][i]=ele
            top += 1
            
            for k in range(top, bottom+1):
                ele += 1
                arr[k][right]=ele
            right -= 1
            
            if top<=bottom:
                for j in range(right, left-1, -1):
                    ele+=1
                    arr[bottom][j]=ele
                bottom -= 1
            
            if left<=right:
                for m in range(bottom, top-1, -1):
                    ele+=1
                    arr[m][left]=ele
                left += 1
        return arr