def pattern(i, n):
    if i == n:
        return 
    else:
        for e in range(i):
            print(chr(65 + (e)),end="")
        print()
        pattern(i + 1, n)


n = 5
print(pattern(1, n + 1))