a=[[1,0,0],
    [0,0,0],
    [1,0,0],
    [0,1,0]]
lst1 = []
lst2 = []
for i in range(len(a)):
    for j in range(len(a[i])):
        if a[i][j] == 1:
            lst1.append(i)
            lst2.append(j)
for i in range(len(lst1)):
    for j in range(len(a[lst1[i]])):
        a[lst1[i]][j] = 1

    for j in range(len(a)):
        a[j][lst2[i]] = 1
for row in a:
    print(row)

# Time Complexity: O(n * n)
# Space Complexity: O(n + n)
