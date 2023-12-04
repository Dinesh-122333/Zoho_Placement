str1 = "xyz"
str2 = "afdgzyxksldfm"
count = 0
str1_dic = {}

for char in str1:
    if char in str1_dic:
        str1_dic[char] += 1
    else:
        str1_dic[char] = 1

for i in range(len(str2)):
    if str2[i] in str1_dic:
        str1_dic[str2[i]] -= 1
        if str1_dic[str2[i]] == 0:
            count += 1

    if count == len(str1):
        print(True)
        break
#Time Complexity:O(N)
#Space Complexity:O(min(len(str1), len(str2)))