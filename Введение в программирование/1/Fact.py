N = int(input())
Fact = 1
if N == 0 or N == 1:
    print(Fact)
else:
    while N > 1:
        Fact *= N
        N -= 1
    print(Fact)        
