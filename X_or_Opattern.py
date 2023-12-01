star = "X"
space = "O"
m, n = 6, 7
arr = [[0 for j in range(n)] for i in range(m)]
top, right, left, bottom = 0, n-1, 0, m-1


while top <= bottom and left <= right:
    if top%2==0:
        for i in range(left, right+1):
            arr[top][i] = "X"  
        top += 1

        for j in range(top, bottom+1):

            arr[j][right] = "X"
        right -= 1

        for k in range(right, left-1, -1):
            arr[bottom][k] = "X"
        bottom -= 1

        for m in range(bottom, top-1, -1):
            arr[m][left]="X"
        left +=1
        
    else:
        for i in range(left, right+1):
            arr[top][i] = "0"  
        top += 1

        for j in range(top, bottom+1):

            arr[j][right] = "0"
        right -= 1

        for k in range(right, left-1, -1):
            arr[bottom][k] = "0"
        bottom -= 1

        for m in range(bottom, top-1, -1):
            arr[m][left] = "0"
        left +=1
    
for  row in arr:
    for ele in row:
        print(ele, end = " ")
    print()    