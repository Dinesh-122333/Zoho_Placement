
def are_permutations(s1, s2):
    return sorted(s1) == sorted(s2)
s1 = "xyz"
s2 = "afdgzyxksldfm"

if len(s1) > len(s2):
    print(False)

for i in range(len(s2) - len(s1) + 1):
    sub = s2[i : i + len(s1)]
    if are_permutations(s1, sub):
        print(True)
        break
#Time Complexity:O(N)
#Space Complexity:O(min(len(str1), len(str2)))